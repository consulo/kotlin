"""Check that a remapped jar's module-info requires every module whose packages its classes use.

Usage: python3 consulo-internal/remap/modcheck.py path/to/remapped.jar [more jars...]
Consulo module descriptors are read from ~/.m2 (cached in ~/.cache/consulo-kotlin-modcheck.json).
"""
import glob, json, os, re, subprocess, sys, zipfile

sys.path.insert(0, os.path.dirname(os.path.abspath(__file__)))
M2 = os.path.expanduser('~/.m2/repository/consulo')
CACHE = os.path.expanduser('~/.cache/consulo-kotlin-modcheck.json')


def describe(jar):
    out = subprocess.run(['jar', '--describe-module', '--file', jar], capture_output=True, text=True).stdout
    lines = out.splitlines()
    if not lines or 'No module descriptor' in out:
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
            used.update(m.rsplit('/', 1)[0] for m in re.findall(r'(?:^|[L\x07\x01\x00\[])((?:consulo|com/intellij)/[\w/$]+?)(?:;|[^\w/$])', data) if '/' in m)
    return own, used


def main():
    modules = consulo_modules()
    by_package = {}
    for m in modules.values():
        for p in m['exports']:
            by_package.setdefault(p.replace('.', '/'), m['name'])
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
            mod = by_package.get(p)
            if mod is None:
                unexported.add(p)
            elif mod not in readable and mod != me['name']:
                missing.setdefault(mod, []).append(p)
        print(f'== {me["name"]} ({os.path.basename(jar)})')
        for d in sorted(declared - set(modules) - {'java.base'}):
            if not d.startswith(('java.', 'jdk.', 'consulo.kotlin')):
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
