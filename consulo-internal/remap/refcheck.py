"""Check that every consulo/* and com/intellij/* member referenced by the remapped jar exists on the Consulo classpath (~/.m2).

Run after `mvn package`: python3 consulo-internal/remap/refcheck.py
"""
import glob, os, re, struct, sys, zipfile, collections

JAR = os.path.join(os.path.dirname(os.path.abspath(__file__)), 'target', 'consulo.kotlin.remapped-3-SNAPSHOT.jar')
M2 = os.path.expanduser('~/.m2/repository/consulo')

def parse(data):
    if data[:4] != b'\xca\xfe\xba\xbe': return None
    n = struct.unpack('>H', data[8:10])[0]; i = 10; cp = [None] * n; k = 1
    while k < n:
        t = data[i]
        if t == 1:
            l = struct.unpack('>H', data[i+1:i+3])[0]; cp[k] = ('U', data[i+3:i+3+l].decode('utf-8', 'replace')); i += 3 + l
        elif t in (3, 4): cp[k] = ('I',); i += 5
        elif t in (5, 6): cp[k] = ('L',); i += 9; k += 1
        elif t == 7: cp[k] = ('C', struct.unpack('>H', data[i+1:i+3])[0]); i += 3
        elif t in (8, 16, 19, 20): cp[k] = ('S',); i += 3
        elif t in (9, 10, 11): cp[k] = ('R', t, *struct.unpack('>HH', data[i+1:i+5])); i += 5
        elif t == 12: cp[k] = ('N', *struct.unpack('>HH', data[i+1:i+5])); i += 5
        elif t == 15: cp[k] = ('MH',); i += 4
        elif t in (17, 18): cp[k] = ('D',); i += 5
        else: raise ValueError(t)
        k += 1
    u = lambda x: cp[x][1]
    cls = lambda x: u(cp[x][1])
    acc, this, sup = struct.unpack('>HHH', data[i:i+6]); i += 6
    ni = struct.unpack('>H', data[i:i+2])[0]; i += 2
    itfs = [cls(struct.unpack('>H', data[i+2*j:i+2*j+2])[0]) for j in range(ni)]; i += 2 * ni
    def members(i):
        cnt = struct.unpack('>H', data[i:i+2])[0]; i += 2; out = set()
        for _ in range(cnt):
            _, nm, ds, ac = struct.unpack('>HHHH', data[i:i+8]); i += 8
            for _ in range(ac):
                l = struct.unpack('>I', data[i+2:i+6])[0]; i += 6 + l
            out.add((u(nm), u(ds)))
        return out, i
    fields, i = members(i)
    methods, i = members(i)
    refs = []
    for e in cp:
        if e and e[0] == 'R':
            _, t, c, nt = e
            refs.append(('F' if t == 9 else 'M', cls(c), u(cp[nt][1]), u(cp[nt][2])))
    return {'name': cls(this), 'super': cls(sup) if sup else None, 'itfs': itfs, 'fields': fields, 'methods': methods, 'refs': refs}

# Consulo classpath: newest non-source jar of every consulo artifact
index = {}
jars = {}
for pom_dir in glob.glob(f'{M2}/**/3-SNAPSHOT', recursive=True):
    cands = [j for j in glob.glob(f'{pom_dir}/*.jar') if not re.search(r'-(sources|tests|javadoc)\.jar$', j)]
    if cands: jars[pom_dir] = max(cands, key=os.path.getmtime)
for j in jars.values():
    try:
        z = zipfile.ZipFile(j)
    except zipfile.BadZipFile:
        continue
    for n in z.namelist():
        if n.endswith('.class') and not n.startswith('META-INF'):
            index.setdefault(n[:-6], (z, n))
cache = {}
def load(name):
    if name in cache: return cache[name]
    e = index.get(name); cache[name] = parse(e[0].read(e[1])) if e else None
    return cache[name]

jar = zipfile.ZipFile(JAR)
own = {}
for n in jar.namelist():
    if n.endswith('.class') and n != 'module-info.class':
        c = parse(jar.read(n)); own[c['name']] = c

OBJECT_METHODS = {'<init>', 'equals', 'hashCode', 'toString', 'getClass', 'clone', 'finalize', 'notify', 'notifyAll', 'wait'}

JDK = ('java/', 'javax/', 'kotlin/', 'jdk/', 'sun/')

def find(owner, kind, name, desc, seen=None):
    """True: member exists. False: hierarchy fully known and member absent. None: hits an unindexed JDK/stdlib type."""
    seen = set() if seen is None else seen
    if owner in seen: return False
    seen.add(owner)
    c = own.get(owner) or load(owner)
    if c is None:
        if owner == 'java/lang/Object':
            return True if name in OBJECT_METHODS else False
        if owner in ('java/lang/Cloneable', 'java/io/Serializable'):
            return False  # marker interfaces, no members
        return None if owner.startswith(JDK) else False
    pool = c['fields'] if kind == 'F' else c['methods']
    if (name, desc) in pool: return True
    if kind == 'M' and name == '<init>': return False
    unknown = False
    for sup in [c['super'], *c['itfs']]:
        if not sup: continue
        r = find(sup, kind, name, desc, seen)
        if r: return True
        if r is None: unknown = True
    return None if unknown else False

missing_cls = collections.defaultdict(set)
missing_mem = collections.defaultdict(set)
for c in own.values():
    for kind, owner, name, desc in c['refs']:
        if owner.startswith('['): continue
        if owner in own:
            # calls through our own classes that land on an inherited Consulo member
            if find(owner, kind, name, desc) is False:
                missing_mem[(owner, kind, name, desc)].add(c['name'])
            continue
        if not owner.startswith(('consulo/', 'com/intellij/')): continue
        if owner not in index:
            missing_cls[owner].add(c['name']); continue
        if find(owner, kind, name, desc) is False:
            missing_mem[(owner, kind, name, desc)].add(c['name'])

print(f'classpath jars: {len(jars)}, classes indexed: {len(index)}, jar classes: {len(own)}')
print(f'\n== MISSING CLASSES ({len(missing_cls)})')
for o, users in sorted(missing_cls.items()):
    print(f'{o.replace("/", ".")}  <- {len(users)} e.g. {sorted(users)[0]}')
print(f'\n== MISSING MEMBERS ({len(missing_mem)})')
for (o, k, n, d), users in sorted(missing_mem.items()):
    print(f'{k} {o.replace("/", ".")}.{n}{d}  <- {len(users)} e.g. {sorted(users)[0]}')

print('\n== SUGGESTED TARGETS (same simple name in Consulo classpath)')
byname = collections.defaultdict(list)
for n in index:
    byname[n.rsplit('/', 1)[-1]].append(n)
for o in sorted(missing_cls):
    if o.startswith('com/intellij/platform/syntax/'): continue
    s = byname.get(o.rsplit('/', 1)[-1], [])
    print(f'{o.replace("/", ".")} -> {", ".join(x.replace("/", ".") for x in s[:3]) or "NOT IN CONSULO"}')
