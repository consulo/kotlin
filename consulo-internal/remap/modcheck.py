"""Check that a remapped jar's module-info requires every module whose packages its classes use.

Usage: python3 consulo-internal/remap/modcheck.py path/to/remapped.jar [more jars...]
Consulo module descriptors are read from ~/.m2 (cached in ~/.cache/consulo-kotlin-modcheck.json).
"""
import glob, json, os, re, subprocess, sys, zipfile

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
M2 = os.path.expanduser('~/.m2/repository/consulo')
CACHE = os.path.expanduser('~/.cache/consulo-kotlin-modcheck.json')
# automatic modules from the Consulo platform lib or plugins we depend on (not in ~/.m2)
PLATFORM_LIBS = {'com.google.common', 'it.unimi.dsi.fastutil', 'asm'}  # asm: Consulo Java plugin


def describe(jar):
    out = subprocess.run(['jar', '--describe-module', '--file', jar], capture_output=True, text=True).stdout
    lines = out.splitlines()
    if not lines or 'No module descriptor' in out:
        return None
    if lines[0].startswith('releases:'):  # multi-release jar: module-info in META-INF/versions
        out = subprocess.run(['jar', '--describe-module', '--file', jar, '--release', '9'], capture_output=True, text=True).stdout
        lines = [l for l in out.splitlines() if not l.startswith('releases:') and l.strip()]
        if not lines:
            return None
    name = lines[0].split('@')[0].split()[0]
    exports, transitive = [], []
    for l in lines[1:]:
        p = l.split()
        if p[:1] == ['exports']:
            exports.append(p[1])
        elif p[:1] == ['requires'] and 'transitive' in p:
            transitive.append(p[1])
    return {'name': name, 'exports': exports, 'transitive': transitive}


def consulo_modules():
    cache = json.load(open(CACHE)) if os.path.exists(CACHE) else {}
    result = {}
    for d in glob.glob(f'{M2}/**/3-SNAPSHOT', recursive=True):
        jars = [j for j in glob.glob(f'{d}/*.jar') if not re.search(r'-(sources|tests|javadoc)\.jar$', j)]
        if not jars:
            continue
        jar = max(jars, key=os.path.getmtime)
        key = f'{jar}:{os.path.getmtime(jar)}'
        if key not in cache:
            cache[key] = describe(jar)
        if cache[key]:
            result[cache[key]['name']] = cache[key]
    os.makedirs(os.path.dirname(CACHE), exist_ok=True)
    json.dump(cache, open(CACHE, 'w'))
    return result


def used_packages(jar):
    z = zipfile.ZipFile(jar)
    own, used = set(), set()
    for n in z.namelist():
        if n.endswith('.class') and n != 'module-info.class':
            own.add(n.rsplit('/', 1)[0])
            data = z.read(n).decode('latin-1')
            used.update(m.rsplit('/', 1)[0] for m in re.findall(r'L((?:[a-z][\w]*/)+[A-Z][\w$]*);', data))
    return own, used


def main():
    modules = consulo_modules()
    by_package = {}
    for m in modules.values():
        for p in m['exports']:
            by_package.setdefault(p.replace('.', '/'), m['name'])
    # libraries next to the checked jars (a plugin's lib/) are modules too
    for jar in {os.path.join(os.path.dirname(os.path.abspath(j)), f) for j in sys.argv[1:] for f in os.listdir(os.path.dirname(os.path.abspath(j))) if f.endswith('.jar')}:
        d = describe(jar)
        if d is None:
            manifest = zipfile.ZipFile(jar).read('META-INF/MANIFEST.MF').decode('utf-8', 'replace') if 'META-INF/MANIFEST.MF' in zipfile.ZipFile(jar).namelist() else ''
            auto = re.search(r'Automatic-Module-Name:\s*(\S+)', manifest)
            base = re.sub(r'-\d.*$', '', os.path.basename(jar)[:-4])
            d = {'name': auto.group(1) if auto else re.sub(r'[^A-Za-z0-9]+', '.', base), 'exports': [], 'transitive': []}
        if not d['exports']:  # automatic module: every package is exported
            d['exports'] = sorted({n.rsplit('/', 1)[0].replace('/', '.') for n in zipfile.ZipFile(jar).namelist() if n.endswith('.class') and '/' in n and not n.startswith('META-INF')})
        modules.setdefault(d['name'], d)
    for p in [m for m in modules.values()]:
        for e in p['exports']:
            by_package.setdefault(e.replace('.', '/'), p['name'])
    for jar in sys.argv[1:]:
        me = describe(jar)
        if not me:
            print(f'{jar}: no module descriptor'); continue
        declared = set(subprocess.run(['jar', '--describe-module', '--file', jar], capture_output=True, text=True).stdout.split('requires ')[1:])
        declared = {d.split()[0] for d in declared}
        readable = set(declared)
        todo = list(declared)
        while todo:  # requires transitive closure
            for t in modules.get(todo.pop(), {}).get('transitive', []):
                if t not in readable:
                    readable.add(t); todo.append(t)
        own, used = used_packages(jar)
        missing, unexported = {}, set()
        for p in sorted(used - own):
            if p.startswith(('java/', 'javax/swing', 'javax/annotation', 'jdk/', 'sun/')):
                continue
            mod = by_package.get(p)
            if mod is None:
                unexported.add(p)
            elif mod not in readable and mod != me['name']:
                missing.setdefault(mod, []).append(p)
        print(f'== {me["name"]} ({os.path.basename(jar)})')
        for d in sorted(declared - set(modules) - {'java.base'}):
            if not d.startswith(('java.', 'jdk.', 'consulo.kotlin')) and d not in PLATFORM_LIBS:
                print(f'  requires unknown module {d}')
        for p in sorted(own):
            other = by_package.get(p)
            if other and other != me['name']:
                print(f'  split package {p.replace("/", ".")} (also in {other})')
        for mod, pkgs in sorted(missing.items()):
            print(f'  missing requires {mod}   e.g. {pkgs[0].replace("/", ".")}')
        if unexported:
            print(f'  packages not exported by any Consulo module: {len(unexported)} e.g. {", ".join(sorted(unexported)[:4])}')


main()
