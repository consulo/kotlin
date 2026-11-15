"""Compute the files of a module that the given seed files reach, for a filter-src include list.

Usage: python3 consulo-internal/remap/subset.py <module dir> <seed path relative to src> [...]
       python3 consulo-internal/remap/subset.py <module dir> --consumers <module dir> [...]
         seeds are the files of <module dir> that the consumer modules' sources name
A file is reached when an included file names one of its top-level declarations and can see it: same package,
an explicit import, or a star import. Over-approximates (simple names, no scopes), which is fine for compiling.
"""
import os, re, sys

TOP_LEVEL = re.compile(
    r'^(?:@\S+\s+)*(?:(?:public|internal|private|protected|open|abstract|sealed|data|enum|annotation|value|inline|'
    r'fun|external|expect|actual|const|final|static|operator|infix|tailrec|suspend|lateinit)\s+)*'
    r'(?:class|interface|object|typealias|fun|val|var|@interface|record)\s+(?:<[^>]*>\s*)?(?:[\w.<>?, ]+\.)?(\w+)',
    re.M)


def scan(path):
    text = open(path, errors='ignore').read()
    text_nc = re.sub(r'/\*.*?\*/', '', text, flags=re.S)
    text_nc = re.sub(r'//[^\n]*', '', text_nc)
    pkg = re.search(r'^package\s+([\w.]+)', text_nc, re.M)
    names = set(TOP_LEVEL.findall(text_nc))
    if path.endswith('.java'):
        names.add(os.path.basename(path)[:-5])
    imports = re.findall(r'^import\s+(?:static\s+)?([\w.]+)(\.\*)?', text_nc, re.M)
    return {
        'pkg': pkg.group(1) if pkg else '',
        'names': names,
        # every prefix too: importing pkg.Name.Companion.member names pkg.Name
        'imports': {'.'.join(i.split('.')[:k]) for i, star in imports if not star for k in range(2, i.count('.') + 2)},
        'stars': {i for i, star in imports if star},
        'idents': set(re.findall(r'\b[A-Za-z_]\w*\b', text_nc)),
    }


def sources(src):
    files = {}
    for d, _, fs in os.walk(src):
        for f in fs:
            if f.endswith(('.kt', '.java')):
                p = os.path.join(d, f)
                files[os.path.relpath(p, src)] = scan(p)
    return files


def visible(me, declared, files):
    """Files declaring a name that [me] uses and can see."""
    for ident in me['idents']:
        for other in declared.get(ident, ()):
            o = files[other]
            if o['pkg'] == me['pkg'] or f"{o['pkg']}.{ident}" in me['imports'] or o['pkg'] in me['stars']:
                yield other


def main():
    module, seeds = sys.argv[1], sys.argv[2:]
    files = sources(os.path.join(module, 'src'))
    declared = {}
    for rel, info in files.items():
        for n in info['names']:
            declared.setdefault(n, []).append(rel)
    if seeds and seeds[0] == '--consumers':
        seeds = sorted({other for consumer in seeds[1:] for me in sources(os.path.join(consumer, 'src')).values()
                        for other in visible(me, declared, files)})
    # generated sources are compiled in full, so whatever they name is reached too
    seeds = list(seeds) + sorted({o for me in sources(os.path.join(module, 'gen')).values()
                                  for o in visible(me, declared, files)})
    todo, done = list(seeds), set()
    while todo:
        rel = todo.pop()
        if rel in done:
            continue
        done.add(rel)
        todo += [o for o in visible(files[rel], declared, files) if o not in done]
    for rel in sorted(done):
        print(f'                                        <include>{rel}</include>')


main()
