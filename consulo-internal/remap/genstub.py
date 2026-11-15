"""Write compile-time stubs of IntelliJ classes from their Consulo counterparts.

Usage: python3 consulo-internal/remap/genstub.py com.intellij.psi.PsiClass [...]

The Consulo class (found through remap.xml, or by simple name in the Java plugin) is read with javap and written
under intellij-stubs with IntelliJ names (the inverse of remap.xml), so every member exists at runtime.
- An existing stub is never replaced: members it lacks are appended, keeping hand-written compat signatures.
- Every method gets a body (interface methods become default), so implementers never miss an abstract member.
- A referenced type without a stub gets a shallow one (declaration and supertypes, no members).
Prints the remap rules to add for classes found by simple name.
"""
import glob, os, re, subprocess, sys, zipfile

ROOT = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..'))
STUBS = f'{ROOT}/consulo-internal/intellij-stubs/src/main/java'
STUBS_KT = f'{ROOT}/consulo-internal/intellij-stubs/src/main/kotlin'
M2 = os.path.expanduser('~/.m2/repository/consulo')
REMAP = open(f'{ROOT}/consulo-internal/remap/remap.xml').read()

CLASS_RULES = dict(re.findall(r'<rule from="([\w.$]+)" to="([\w.$]+)"', re.search(r'<classes>(.*?)</classes>', REMAP, re.S).group(1)))
PACKAGE_RULES = dict(re.findall(r'<rule from="([\w.]+)" to="([\w.]+)"', re.search(r'<packages>(.*?)</packages>', REMAP, re.S).group(1)))
INVERSE_CLASSES = {}
for k, v in CLASS_RULES.items():
    INVERSE_CLASSES.setdefault(v, k)
INVERSE_PACKAGES = {}
for k, v in PACKAGE_RULES.items():
    INVERSE_PACKAGES.setdefault(v, k)
# Java plugin packages, mapped class by class in remap.xml
INVERSE_PACKAGES.update({
    'com.intellij.java.language.impl.psi.impl': 'com.intellij.psi.impl',
    'com.intellij.java.language.impl.psi': 'com.intellij.psi',
    'com.intellij.java.language.psi': 'com.intellij.psi',
    'com.intellij.java.language.jvm': 'com.intellij.lang.jvm',
    'com.intellij.java.language': 'com.intellij.pom.java',
})

JARS = sorted({max([j for j in glob.glob(f'{d}/*.jar') if not re.search(r'-(sources|tests|javadoc)\.jar$', j)], key=os.path.getmtime)
               for d in glob.glob(f'{M2}/**/3-SNAPSHOT', recursive=True)
               if '/consulo/kotlin/' not in d + '/'  # our own artifacts, the stubs among them
               and [j for j in glob.glob(f'{d}/*.jar') if not re.search(r'-(sources|tests|javadoc)\.jar$', j)]})
CP = ':'.join(JARS)
CLASS_INDEX = {}
for j in JARS:
    try:
        for n in zipfile.ZipFile(j).namelist():
            if n.endswith('.class') and '-' not in n and not n.startswith('META-INF'):
                CLASS_INDEX.setdefault(n[:-6].replace('/', '.'), j)
    except zipfile.BadZipFile:
        pass

def _pure_forward(ij):
    if ij in CLASS_RULES:
        return CLASS_RULES[ij]
    pkg, _, name = ij.rpartition('.')
    best = max((p for p in PACKAGE_RULES if pkg == p or pkg.startswith(p + '.')), key=len, default=None)
    return (PACKAGE_RULES[best] + pkg[len(best):] + '.' + name) if best else None


# existing stubs win over the package-rule inverse: Consulo's consulo.language.psi.resolve.ResolveState is the
# com.intellij.psi.ResolveState stub, not a new com.intellij.psi.resolve.ResolveState
for _path in glob.glob(f'{STUBS}/**/*.java', recursive=True):
    _ij = os.path.relpath(_path, STUBS)[:-5].replace('/', '.')
    _c = _pure_forward(_ij)
    if _c:
        INVERSE_CLASSES.setdefault(_c, _ij)

# Consulo-only members that clash with upstream Kotlin declarations
SKIP_MEMBERS = {
    # Consulo's modifier conveniences: light classes declare members with these JVM names themselves
    ('com.intellij.psi.PsiMember', 'isStatic'),
    ('com.intellij.psi.PsiMember', 'isFinal'),
    ('com.intellij.psi.PsiMember', 'isAbstract'),
    ('com.intellij.psi.PsiMember', 'isPrivate'),
    ('com.intellij.psi.PsiMember', 'isProtected'),
    ('com.intellij.psi.PsiMember', 'isPublic'),
}

JDK = ('java.', 'javax.', 'kotlin.', 'jdk.', 'sun.', 'org.jetbrains.annotations.')
new_rules = []


def forward(ij):
    """IntelliJ class name -> Consulo class name."""
    if ij in CLASS_RULES:
        return CLASS_RULES[ij]
    pkg, _, name = ij.rpartition('.')
    best = max((p for p in PACKAGE_RULES if pkg == p or pkg.startswith(p + '.')), key=len, default=None)
    if best:
        c = PACKAGE_RULES[best] + pkg[len(best):] + '.' + name
        if c in CLASS_INDEX:
            return c
    simple = ij.rsplit('.', 1)[-1].replace('$', '.').split('.')[-1]
    outer = ij.rsplit('.', 1)[-1].split('$')[0]
    cands = [c for c in CLASS_INDEX if c.rsplit('.', 1)[-1] == ij.rsplit('.', 1)[-1] and c.startswith('com.intellij.java.')]
    if not cands:
        cands = [c for c in CLASS_INDEX if c.rsplit('.', 1)[-1] == ij.rsplit('.', 1)[-1]]
    if len(cands) >= 1:
        c = sorted(cands, key=len)[0]
        if '$' not in ij:
            new_rules.append(f'        <rule from="{ij}" to="{c}"/>')
            CLASS_RULES[ij] = c
            INVERSE_CLASSES.setdefault(c, ij)
        return c
    return None


def inverse(consulo):
    """Consulo class name (with $ for nested) -> IntelliJ class name (with $)."""
    outer, _, nested = consulo.partition('$')
    if outer in INVERSE_CLASSES:
        ij = INVERSE_CLASSES[outer]
    else:
        pkg, _, name = outer.rpartition('.')
        best = max((p for p in INVERSE_PACKAGES if pkg == p or pkg.startswith(p + '.')), key=len, default=None)
        ij = (INVERSE_PACKAGES[best] + pkg[len(best):] + '.' + name) if best else outer
    return ij + ('$' + nested if nested else '')


def stub_path(ij):
    outer = ij.split('$')[0]
    return f'{STUBS}/{outer.replace(".", "/")}.java'


def stub_exists(ij):
    outer = ij.split('$')[0]
    if os.path.exists(stub_path(outer)):
        return True
    pkg = outer.rsplit('.', 1)[0].replace('.', '/')
    name = outer.rsplit('.', 1)[1]
    for kt in glob.glob(f'{STUBS_KT}/{pkg}/*.kt'):
        if re.search(rf'\b(class|interface|object)\s+{name}\b', open(kt).read()):
            return True
    return False


pending_shallow = set()
pending_nested = set()


def translate(text):
    def repl(m):
        name = m.group(0)
        if name.startswith(JDK) or '.' not in name:
            return name.replace('$', '.')
        ij = inverse(name)
        if not stub_exists(ij) and ij.split('$')[0] not in generated:
            pending_shallow.add(name.split('$')[0])
        if '$' in name:
            pending_nested.add(name)
        return ij.replace('$', '.')
    return re.sub(r'\b[a-z][\w]*(?:\.[\w$]+)+', repl, text)


def javap(name):
    r = subprocess.run(['javap', '-p', '-v', '-constants', '-cp', CP, name], capture_output=True, text=True)
    return r.stdout


def parse(name):
    out = javap(name)
    lines = out.splitlines()
    header = None
    cls_flags = ''
    members = []
    i = 0
    while i < len(lines):
        l = lines[i]
        if header is None and re.match(r'^(public |protected |abstract |final |static )*(class|interface|enum|@interface) ', l.strip()) and not l.startswith(' '):
            header = l.strip()
        elif l.startswith('  flags:') and not members and cls_flags == '':
            cls_flags = l
        elif re.match(r'^  \S.*;$', l) and not l.startswith('  #'):
            decl = l.strip()
            j = i + 1
            info = {'decl': decl, 'flags': '', 'const': None}
            while j < len(lines) and lines[j].startswith('    '):
                s = lines[j].strip()
                if s.startswith('flags:'):
                    info['flags'] = s
                elif s.startswith('ConstantValue:'):
                    info['const'] = s.split(' ', 2)[2] if s.count(' ') >= 2 else None
                j += 1
            members.append(info)
            i = j
            continue
        i += 1
    return header, cls_flags, members


def default_value(t):
    t = t.strip()
    return {'void': None, 'boolean': 'false', 'char': "'\\0'", 'byte': '(byte) 0', 'short': '(short) 0', 'int': '0',
            'long': '0L', 'float': '0f', 'double': '0d'}.get(t, 'null')


def split_params(s):
    out, depth, cur = [], 0, ''
    for ch in s:
        if ch == '<': depth += 1
        if ch == '>': depth -= 1
        if ch == ',' and depth == 0:
            out.append(cur.strip()); cur = ''
        else:
            cur += ch
    if cur.strip():
        out.append(cur.strip())
    return out


def erase(t):
    return re.sub(r'<.*>', '', t).replace('...', '[]').split('.')[-1].strip()


def member_source(info, kind, cls_simple, consulo_simple=None):
    decl, flags = info['decl'], info['flags']
    if 'ACC_PRIVATE' in flags or 'ACC_SYNTHETIC' in flags or 'ACC_BRIDGE' in flags:
        return None, None
    if not ('ACC_PUBLIC' in flags or 'ACC_PROTECTED' in flags):
        return None, None
    if decl.startswith('static {}') or '{}' in decl:
        return None, None
    decl = re.sub(r'\b(native|synchronized|transient|volatile|strictfp)\s+', '', decl)
    m = re.match(r'^(.*?)([\w$]+)\((.*)\)(\s+throws\s+[^;]+)?;$', decl)
    if not m:  # field
        fm = re.match(r'^(.*\s)?([\w.$<>\[\], ?]+)\s+([\w$]+);$', decl)
        if not fm:
            return None, None
        mods, ftype, fname = (fm.group(1) or ''), fm.group(2), fm.group(3)
        if kind == 'enum' and 'ACC_ENUM' in flags:
            return ('enum', fname), fname
        ftype_t = translate(ftype)
        if 'static' in mods and 'final' in mods or kind == 'interface':
            if info['const'] is not None and ftype.strip() in ('java.lang.String', 'String'):
                val = '"' + info['const'].replace('\\', '\\\\').replace('"', '\\"') + '"'
            elif info['const'] is not None:
                val = info['const'] + ('L' if ftype.strip() == 'long' else 'f' if ftype.strip() == 'float' else '')
            else:
                val = default_value(ftype)
            mods = re.sub(r'\b(public|protected)\b', r'\1', mods)
            return ('field', fname), f'    {translate(mods)}{ftype_t} {fname} = {val};'
        mods = mods.replace('final ', '')
        return ('field', fname), f'    {translate(mods)}{ftype_t} {fname};'
    pre, name, params, throws = m.group(1), m.group(2), m.group(3), m.group(4) or ''
    params_l = split_params(params)
    is_ctor = '.' in name or name == cls_simple or pre.strip().endswith('.') or re.search(r'[\w$.]+$', pre.strip() or 'x') is None
    pre_t = translate(pre)
    params_t = [translate(p) for p in params_l]
    key = (name.split('.')[-1].split('$')[-1], tuple(erase(p) for p in params_t))
    named = ', '.join(f'{p} p{k}' for k, p in enumerate(params_t))
    throws_t = translate(throws)
    if kind == 'enum' and name in ('values', 'valueOf'):
        return None, None
    # constructors: javap prints the fully qualified class name
    if name.split('.')[-1].split('$')[-1] in (cls_simple, consulo_simple) and not re.search(r'\w\s+$', pre.replace('public ', '').replace('protected ', '')):
        if kind != 'class':
            return None, None
        mods = 'protected ' if 'protected' in pre else 'public '
        return ('ctor', key[1]), f'    {mods}{cls_simple}({named}){throws_t} {{ }}'
    pre_t = re.sub(r'\b(abstract|final)\s+', '', pre_t)
    ret = re.sub(r'^.*?((?:<.*>\s+)?)(\S+)\s*$', r'\2', pre_t.replace('default ', '').replace('static ', '').replace('public ', '').replace('protected ', ''))
    dv = default_value(ret.split()[-1] if ret.strip() else 'void')
    body = '{ }' if dv is None else f'{{ return {dv}; }}'
    if kind == 'interface' and 'static' not in pre_t and 'default' not in pre_t:
        body = ';'  # abstract, as in IntelliJ: Kotlin interfaces combining PSI interfaces rely on it
        throws_t = throws_t
    sep = '' if body == ';' else ' '
    return ('method', key), f'    {pre_t}{name.split(".")[-1].split("$")[-1]}({named}){throws_t}{sep}{body}'


generated = set()


def class_source(consulo, ij, shallow, indent=''):
    header, cls_flags, members = parse(consulo)
    if not header:
        return None, None
    kind = 'enum' if 'ACC_ENUM' in cls_flags else 'interface' if 'ACC_INTERFACE' in cls_flags else 'class'
    simple = ij.split('.')[-1].split('$')[-1]
    # header: modifiers kind name<type params> [extends ...] [implements ...]; type params may contain ' extends '
    m = re.match(r'^(.*?\b(?:class|interface|enum|@interface)\s+[\w.$]+)(.*)$', header)
    tail = m.group(2)
    tparams = ''
    if tail.startswith('<'):
        depth = 0
        for k, ch in enumerate(tail):
            depth += {'<': 1, '>': -1}.get(ch, 0)
            if depth == 0:
                tparams, tail = translate(tail[:k + 1]), tail[k + 1:]
                break
    rest = translate(tail.rstrip()) if tail.strip() else ''
    if kind == 'enum':
        rest = re.sub(r'extends [\w.]*Enum<[^>]*>\s*', '', rest).strip()
        rest = (' ' + rest) if rest else ''
    abstract = 'abstract ' if 'ACC_ABSTRACT' in cls_flags and kind == 'class' else ''
    static = 'static ' if indent else ''
    out = [f'{indent}@SuppressWarnings("all")', f'{indent}public {static}{abstract}{kind} {simple}{tparams}{rest} {{']
    keys = {}
    if not shallow:
        enum_consts = []
        for info in members:
            key, src = member_source(info, kind, simple, consulo.split('.')[-1].split('$')[-1])
            if key is None:
                continue
            if key[0] == 'enum':
                enum_consts.append(src)
                continue
            keys[key] = src
        if kind == 'enum':
            out.append(f'{indent}    ' + ', '.join(enum_consts) + ';')
        for k, src in keys.items():
            out.append(indent + src)
    elif kind == 'enum':
        out.append(f'{indent}    ;')
    if kind == 'class' and not any(k[0] == 'ctor' and k[1] == () for k in keys):
        out.append(f'{indent}    protected {simple}() {{ }}')
    out.append(f'{indent}}}')
    return '\n'.join(out), keys


def nested_names(consulo):
    j = CLASS_INDEX.get(consulo)
    if not j:
        return []
    prefix = consulo.replace('.', '/') + '$'
    names = []
    for n in zipfile.ZipFile(j).namelist():
        if n.startswith(prefix) and n.endswith('.class'):
            rest = n[len(prefix):-6]
            if '$' not in rest and not rest[0].isdigit():
                names.append(consulo + '$' + rest)
    return names


def write_new(ij, consulo, shallow):
    generated.add(ij)
    src, _ = class_source(consulo, ij, shallow)
    if src is None:
        print(f'cannot read {consulo}', file=sys.stderr)
        return
    body = src.rsplit('}', 1)[0]
    if not shallow:
        for n in nested_names(consulo):
            nsrc, _ = class_source(n, inverse(n), False, indent='    ')
            if nsrc:
                body += nsrc + '\n'
    pkg = ij.rsplit('.', 1)[0]
    path = stub_path(ij)
    os.makedirs(os.path.dirname(path), exist_ok=True)
    open(path, 'w').write(f'package {pkg};\n\n// Generated by consulo-internal/remap/genstub.py from {consulo}\n{body}}}\n')
    print(('shallow ' if shallow else 'wrote   ') + ij)


def existing_keys(text):
    keys = set()
    for m in re.finditer(r'\b([\w$]+)\s*\(([^()]*)\)\s*(?:throws [^{;]+)?[{;]', text):
        params = [re.sub(r'\s+\w+$', '', p.strip()) for p in split_params(m.group(2))] if m.group(2).strip() else []
        keys.add(('method', (m.group(1), tuple(erase(p) for p in params))))
        keys.add(('ctor', tuple(erase(p) for p in params)))
    for m in re.finditer(r'\b([\w$]+)\s*(=|;)', text):
        keys.add(('field', m.group(1)))
    return keys


def relax(text, is_interface):
    def body(m):
        mods, ret, rest = m.group(1), m.group(2), m.group(3)
        dv = default_value(ret.split()[-1] if ret.strip() else 'void')
        b = '{ }' if dv is None else f'{{ return {dv}; }}'
        mods = mods.replace('abstract ', '')
        if is_interface:
            indent = re.match(r'^\s*', mods).group(0)
            mods = mods.replace('public ', 'public default ') if 'public ' in mods else indent + 'default ' + mods.lstrip()
        return f'{mods}{ret}{rest} {b}'
    lines = []
    for line in text.splitlines(keepends=True):
        stripped = line.rstrip('\n')
        if stripped.rstrip().endswith(');') and '(' in stripped and '=' not in stripped and not stripped.lstrip().startswith(('//', '*', 'return', 'super', 'this')) \
                and (is_interface or ' abstract ' in f' {stripped} ') and ' static ' not in f' {stripped} ' and ' default ' not in f' {stripped} ':
            m = re.match(r'^(\s*(?:(?:public|protected|abstract)\s+)*(?:<[^()]*>\s+)?)([\w.$<>\[\], ?]+?)(\s+[\w$]+\s*\(.*\)(?:\s*throws [^;]+)?)\s*;\s*$', stripped)
            if m:
                lines.append(body(m) + '\n')
                continue
        lines.append(line)
    return ''.join(lines)


def relax_interface(text, consulo_default):
    """Hand-written interface methods that Consulo declares as default ones become default here too."""
    out = []
    for line in text.splitlines(keepends=True):
        stripped = line.rstrip('\n')
        mm = MEMBER.match(stripped)
        if mm and stripped.rstrip().endswith(';') and ' static ' not in f' {stripped} ' and ' default ' not in f' {stripped} ':
            params = [re.sub(r'\s+\w+$', '', p.strip()) for p in split_params(mm.group(4))] if mm.group(4).strip() else []
            key = ('method', (mm.group(3), tuple(erase(p) for p in params)))
            if key in consulo_default:
                out.append(relax(line, True))
                continue
        out.append(line)
    return ''.join(out)


def sync_supertypes(text, consulo, simple, is_interface):
    """Adds the Consulo class' supertypes that a hand-written stub does not declare."""
    header, _, _ = parse(consulo)
    if not header:
        return text
    m = re.match(r'^(.*?\b(?:class|interface|enum)\s+[\w.$]+)(.*)$', header)
    tail = m.group(2)
    if tail.startswith('<'):
        depth = 0
        for k, ch in enumerate(tail):
            depth += {'<': 1, '>': -1}.get(ch, 0)
            if depth == 0:
                tail = tail[k + 1:]
                break
    wanted = []
    for part in re.findall(r'\b(?:extends|implements)\s+(.*?)(?=\s+implements\b|$)', tail):
        depth, cur = 0, ''
        for ch in part:
            depth += {'<': 1, '>': -1}.get(ch, 0)
            if ch == ',' and depth == 0:
                wanted.append(cur.strip()); cur = ''
            else:
                cur += ch
        if cur.strip():
            wanted.append(cur.strip())
    if not is_interface and wanted and ' extends ' in tail.split(' implements ')[0]:
        wanted = wanted[1:]  # the superclass is left as written; only interfaces are added
    decl = re.search(rf'^(public\s+(?:abstract\s+|final\s+)*(?:class|interface)\s+{simple}\b[^{{]*)\{{', text, re.M)
    if not decl:
        return text
    current = decl.group(1)
    missing = []
    for w in wanted:
        ij_type = translate(w)
        base = re.sub(r'<.*', '', ij_type).strip()
        if base.startswith('java.lang.Object') or re.search(rf'\b{re.escape(base.split(".")[-1])}\b', current):
            continue
        missing.append(ij_type)
    if not missing:
        return text
    if is_interface:
        new = current.rstrip() + (', ' if ' extends ' in current else ' extends ') + ', '.join(missing) + ' '
    else:
        new = current.rstrip() + (', ' if ' implements ' in current else ' implements ') + ', '.join(missing) + ' '
    print(f'supers  {simple} + {", ".join(missing)}')
    return text.replace(current, new, 1)


def merge(ij, consulo):
    generated.add(ij)
    path = stub_path(ij)
    text = open(path).read()
    simple = ij.split('.')[-1]
    _, keys = class_source(consulo, ij, False)
    if keys is None:
        return
    have = existing_keys(text)
    is_interface = re.search(rf'\binterface\s+{simple}\b', text) is not None
    keys = {k: v for k, v in keys.items() if not (k[0] == 'method' and (ij, k[1][0]) in SKIP_MEMBERS)}
    text = sync_supertypes(text, consulo, simple, is_interface)
    is_class = not is_interface
    inherited_keys = set()
    if is_interface:
        types = stub_types()
        def collect(t, seen=()):
            info = types.get(t)
            if not info or t in seen:
                return
            for sup in info['supers']:
                sinfo = types.get(sup)
                if sinfo:
                    inherited_keys.update(sinfo['methods'])
                collect(sup, seen + (t,))
        collect(ij)
    add = []
    for k, src in keys.items():
        if k in have or (k[0] == 'method' and ('method', k[1]) in have):
            continue
        if is_interface and k[0] == 'method' and k[1] in inherited_keys and src.rstrip().endswith(';'):
            continue  # an abstract redeclaration would clash with covariant Kotlin overrides
        if k[0] == 'ctor' and not is_class:
            continue
        if is_class:
            src = src.replace('public default ', 'public ').replace(' default ', ' ')
        add.append(src)
    if is_class and not re.search(rf'\b{simple}\s*\(\s*\)\s*(throws [^{{]+)?\{{', text) and \
            (re.search(rf'\b{simple}\s*\([^)]', text) or any(f' {simple}(' in a for a in add)) and \
            not any(f' {simple}()' in a for a in add):
        add.append(f'    protected {simple}() {{ }}')
    # like generated stubs, hand-written ones get bodies, so subclasses never miss an abstract member
    if is_interface:
        consulo_default = {k for k, src in keys.items() if k[0] == 'method' and not src.rstrip().endswith(';')}
        relaxed = relax_interface(text, consulo_default)
    else:
        relaxed = relax(text, False)
    if not add and relaxed == text and text == open(path).read():
        return
    text = relaxed
    i = text.rstrip().rfind('}')
    text = text[:i] + '    // Added by consulo-internal/remap/genstub.py from ' + consulo + '\n' + '\n'.join(add) + '\n' + text[i:]
    open(path, 'w').write(text)
    print(f'merged  {ij} (+{len(add)})')


TYPE_DECL = re.compile(r'^public\s+(?:abstract\s+|final\s+)*(class|interface|enum)\s+(\w+)(<.*?>)?\s*(.*?)\{', re.M)
MEMBER = re.compile(r'^ {2,4}(?:public |protected )?(?:static )?(?:default )?(?:abstract )?(?:final )?(<[^()]*>\s+)?([\w.$<>\[\], ?]+?)\s+(\w+)\s*\(([^()]*)\)')


def stub_types():
    types = {}
    for path in glob.glob(f'{STUBS}/**/*.java', recursive=True):
        text = open(path).read()
        pkg = re.search(r'^package\s+([\w.]+);', text, re.M)
        m = TYPE_DECL.search(text)
        if not pkg or not m:
            continue
        name = f'{pkg.group(1)}.{m.group(2)}'
        supers = []
        for part in re.split(r'\b(?:extends|implements)\b', m.group(4)):
            depth, cur = 0, ''
            for ch in part:
                depth += {'<': 1, '>': -1}.get(ch, 0)
                if ch == ',' and depth == 0:
                    supers.append(cur.strip()); cur = ''
                else:
                    cur += ch if depth == 0 or ch == '<' and depth == 1 else ''
            if cur.strip():
                supers.append(cur.strip())
        imports = dict((i.rsplit('.', 1)[1], i) for i in re.findall(r'^import\s+([\w.]+);', text, re.M))
        superclass = None
        if m.group(1) == 'class':
            ext = re.match(r'\s*extends\s+([\w.$]+)', m.group(4))
            if ext:
                superclass = ext.group(1)
                if '.' not in superclass:
                    superclass = imports.get(superclass, f'{pkg.group(1)}.{superclass}')
        resolved = []
        for sname in supers:
            sname = re.sub(r'<.*', '', sname).strip()
            if not sname:
                continue
            if '.' not in sname:
                sname = imports.get(sname, f'{pkg.group(1)}.{sname}')
            resolved.append(sname)
        methods = {}
        static_methods = set()
        for line in text.splitlines():
            mm = MEMBER.match(line)
            if mm and mm.group(3) not in ('if', 'for', 'while', 'return', 'new', 'switch'):
                params = [re.sub(r'\s+\w+$', '', p.strip()) for p in split_params(mm.group(4))] if mm.group(4).strip() else []
                key = (mm.group(3), tuple(erase(p) for p in params))
                if ' static ' in f' {line} ':
                    static_methods.add(key)
                    continue
                has_body = '{' in line and ' abstract ' not in f' {line} '
                methods[key] = ((mm.group(1) or '') + mm.group(2), mm.group(4), has_body, line)
        types[name] = {'path': path, 'kind': m.group(1), 'supers': resolved, 'methods': methods, 'simple': m.group(2),
                       'superclass': superclass}
    return types


def fix_diamonds():
    """Adds the overrides Java requires when a stub type inherits one method from two unrelated supertypes."""
    changed = True
    rounds = 0
    while changed and rounds < 10:
        changed, rounds = False, rounds + 1
        types = stub_types()
        memo = {}

        def inherited(t, seen=()):
            if t in memo:
                return memo[t]
            info = types.get(t)
            if info is None or t in seen:
                return {}
            out = {k: {t} for k in info['methods']}
            for sup in info['supers']:
                for k, origins in inherited(sup, seen + (t,)).items():
                    if k not in info['methods']:
                        out.setdefault(k, set()).update(origins)
            memo[t] = out
            return out

        def concrete_in_superclass(t, k, seen=()):
            sc = types.get(t, {}).get('superclass')
            while sc and sc in types and sc not in seen:
                meth = types[sc]['methods'].get(k)
                if meth and meth[2]:
                    return True
                seen = seen + (sc,)
                sc = types[sc].get('superclass')
            return False

        def subtype(a, b, seen=()):
            return a == b or any(subtype(x, b, seen + (a,)) for x in types.get(a, {}).get('supers', []) if x not in seen)

        for t, info in types.items():
            add = []
            for sup_k in {k for sup in info['supers'] for k in inherited(sup)}:
                if sup_k in info['methods']:
                    continue
                if info['kind'] == 'class' and concrete_in_superclass(t, sup_k):
                    continue
                origins = set()
                for sup in info['supers']:
                    origins |= inherited(sup).get(sup_k, set())
                roots = [o for o in origins if not any(o != q and subtype(q, o) for q in origins)]
                if len(roots) < 2 or not any(types[o]['methods'][sup_k][2] for o in roots):
                    continue
                ret, params, _, _ = types[sorted(roots)[0]]['methods'][sup_k]
                ret = re.sub(r'^(public|protected|default|abstract|static)\s+', '', ret.strip())
                dv = default_value(ret.split()[-1] if ret.strip() else 'void')
                body = '{ }' if dv is None else f'{{ return {dv}; }}'
                if info['kind'] == 'interface':
                    add.append(f'    {ret} {sup_k[0]}({params});')
                else:
                    add.append(f'    public {ret} {sup_k[0]}({params}) {body}')
            if add:
                text = open(info['path']).read()
                i = text.rstrip().rfind('}')
                open(info['path'], 'w').write(text[:i] + '    // Overrides required by unrelated inherited declarations (genstub.py)\n' + '\n'.join(sorted(set(add))) + '\n' + text[i:])
                print(f'diamond {t} (+{len(set(add))})')
                changed = True


def implement_abstract():
    """Concrete stub classes get bodies for the abstract members they inherit and do not implement."""
    types = stub_types()

    def all_methods(t, seen=()):
        info = types.get(t)
        if info is None or t in seen:
            return {}
        out = {}
        for sup in info['supers']:
            for k, v in all_methods(sup, seen + (t,)).items():
                if k not in out or v[2]:
                    out[k] = v
        for k, v in info['methods'].items():
            out[k] = v
        return out

    for t, info in types.items():
        if info['kind'] != 'class':
            continue
        text = open(info['path']).read()
        if re.search(rf'public\s+(static\s+)?abstract\s+class\s+{info["simple"]}\b', text):
            continue
        add = []
        for k, (ret, params, has_body, _) in all_methods(t).items():
            if has_body or k in info['methods']:
                continue
            ret = re.sub(r'^(public|protected|default|abstract|static)\s+', '', ret.strip())
            dv = default_value(ret.split()[-1] if ret.strip() else 'void')
            body = '{ }' if dv is None else f'{{ return {dv}; }}'
            add.append(f'    public {ret} {k[0]}({params}) {body}')
        if add:
            i = text.rstrip().rfind('}')
            open(info['path'], 'w').write(text[:i] + '    // Inherited abstract members (genstub.py)\n' + '\n'.join(sorted(set(add))) + '\n' + text[i:])
            print(f'implemented {t} (+{len(set(add))})')


def check():
    """Stub classes whose remapped Consulo class does not exist, with same-named candidates."""
    for path in sorted(glob.glob(f'{STUBS}/**/*.java', recursive=True)):
        ij = os.path.relpath(path, STUBS)[:-5].replace('/', '.')
        target = _pure_forward(ij) or ij
        if target in CLASS_INDEX or target.startswith('consulo.kotlin.') or ij.startswith(('org.', 'kotlin.')):
            continue
        name = ij.rsplit('.', 1)[1]
        cands = sorted((c for c in CLASS_INDEX if c.rsplit('.', 1)[-1] == name), key=len)[:3]
        print(f'{ij} -> {target}   candidates: {", ".join(cands) or "-"}')


def main():
    if sys.argv[1:] == ['--check']:
        check()
        return
    for ij in sys.argv[1:]:
        consulo = forward(ij)
        if not consulo or consulo not in CLASS_INDEX:
            print(f'no Consulo class for {ij}', file=sys.stderr)
            continue
        if stub_exists(ij):
            if os.path.exists(stub_path(ij)):
                merge(ij, consulo)
            else:
                print(f'skip    {ij} (Kotlin stub)')
        else:
            write_new(ij, consulo, False)
    done_nested = set()
    while pending_nested or pending_shallow:
        while pending_nested:
            n = pending_nested.pop()
            outer_c, _, nested = n.partition('$')
            if n in done_nested or '$' in nested or not nested or nested[0].isdigit():
                continue
            done_nested.add(n)
            outer_ij = inverse(outer_c)
            path = stub_path(outer_ij)
            if not os.path.exists(path) or n not in CLASS_INDEX:
                continue
            text = open(path).read()
            if re.search(rf'\b(class|interface|enum)\s+{nested}\b', text):
                continue
            nsrc, _ = class_source(n, inverse(n), False, indent='    ')
            if not nsrc:
                continue
            if re.search(rf'\binterface\s+{outer_ij.split(".")[-1]}\b', text):
                nsrc = nsrc.replace('public static ', 'public ', 1)
            i = text.rstrip().rfind('}')
            open(path, 'w').write(text[:i] + nsrc + '\n' + text[i:])
            print(f'nested  {outer_ij}.{nested}')
        if not pending_shallow:
            break
        c = pending_shallow.pop()
        ij = inverse(c)
        if '$' in c:
            continue
        if stub_exists(ij) or ij in generated or c not in CLASS_INDEX:
            continue
        write_new(ij, c, True)
    fix_diamonds()
    implement_abstract()
    if new_rules:
        print('\nremap.xml class rules to add:')
        print('\n'.join(dict.fromkeys(new_rules)))


main()
