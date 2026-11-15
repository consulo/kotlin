"""Generate Maven poms for upstream Gradle modules, from their build.gradle.kts project dependencies.

Usage: python3 consulo-internal/remap/genpom.py [--closure] :gradle:path [...]
  --closure  also every project dependency (transitively) that is not in the root pom yet
  --missing  write poms for the root pom's modules that have none (e.g. after a generator change)
Existing poms are never overwritten; the module list in the root pom is printed in build order.
"""
import os, re, sys

ROOT = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..'))
SETTINGS = open(f'{ROOT}/settings.gradle.kts').read()
OVERRIDES = dict(re.findall(r'project\("(:[^"]+)"\)\.projectDir\s*=\s*File\("\$rootDir/([^"]+)"\)', SETTINGS))
# Gradle helpers like optInToObsoleteDescriptorBasedAPI(), as defined in the build conventions
OPT_IN_HELPERS = dict(re.findall(r'fun Project\.(optInTo\w+)\(\)\s*\{\s*optInTo\("([\w.]+)"\)',
                                 open(f'{ROOT}/repo/gradle-build-conventions/buildsrc-compat/src/main/kotlin/tasks.kt').read()))
CONFIGS = ('api', 'implementation', 'compileOnly', 'embedded')
# Gradle projects that are not compiled here: provided by the parent pom or the platform
SKIP = {':kotlin-stdlib', ':kotlin-reflect', ':kotlin-annotations-jvm', ':kotlin-script-runtime', ':core:builtins'}


def module_dir(path):
    return OVERRIDES.get(path, path.strip(':').replace(':', '/'))


def artifact_id(directory):
    pom = f'{ROOT}/{directory}/pom.xml'
    if os.path.exists(pom):
        s = re.sub(r'<parent>.*?</parent>', '', open(pom).read(), flags=re.S)
        return re.search(r'<artifactId>([^<]+)', s).group(1)
    parts = directory.split('/')
    out = []
    for p in parts:
        prev = out[-1].split('.')[-1] if out else None
        if prev and (p.startswith(prev + '-') or p.startswith(prev + '.')):
            p = p[len(prev) + 1:]
        out.append(p)
    return 'consulo.kotlin.' + '.'.join(out)


def dependencies_block(directory):
    f = f'{ROOT}/{directory}/build.gradle.kts'
    if not os.path.exists(f):
        return None
    s = open(f).read()
    m = re.search(r'(^|\n)dependencies\s*\{', s)
    if not m:
        return '', s
    i = j = m.end()
    depth = 1
    while depth and j < len(s):
        depth += {'{': 1, '}': -1}.get(s[j], 0)
        j += 1
    return s[i:j], s


def project_deps(path):
    r = dependencies_block(module_dir(path))
    if r is None:
        return None
    block, _ = r
    deps = []
    for line in block.splitlines():
        line = line.strip()
        conf = re.match(r'(\w+)\s*\(', line)
        if not conf or conf.group(1) not in CONFIGS:
            continue
        for d in re.findall(r'project\(\s*"(:[^"]+)"', line):
            if d not in SKIP and d != path:
                deps.append((d, 'provided' if conf.group(1) == 'compileOnly' else None))
    merged = {}
    for d, scope in deps:  # declared twice (e.g. api and compileOnly): the wider scope wins
        merged[d] = None if d in merged and merged[d] is None else scope
    return list(merged.items())


def opt_ins(path):
    r = dependencies_block(module_dir(path))
    if r is None:
        return []
    _, s = r
    found = []
    for m in re.finditer(r'optIn\.addAll\((.*?)\n\s*\)', s, re.S):  # multi-line lists, main sources only
        header = re.findall(r'^\S[^\n]*\{\s*$', s[:m.start()], re.M)
        if not header or 'test' not in header[-1].lower():
            found += re.findall(r'"((?:org\.jetbrains|kotlin)\.[\w.]+)"', m.group(1))
    for helper, annotation in OPT_IN_HELPERS.items():
        if re.search(rf'^\s*{helper}\(\)', s, re.M):
            found.append(annotation)
    for line in s.splitlines():
        if 'optIn' in line or 'opt-in' in line:
            found += re.findall(r'"(?:-opt-in=)?((?:org\.jetbrains|kotlin)\.[\w.]+)"', line)
    return list(dict.fromkeys(found))


def pom(path):
    directory = module_dir(path)
    depth = directory.count('/') + 1
    deps = ''
    for d, scope in project_deps(path):
        deps += f'''        <dependency>
            <groupId>${{project.groupId}}</groupId>
            <artifactId>{artifact_id(module_dir(d))}</artifactId>
            <version>${{project.version}}</version>{f"""
            <scope>{scope}</scope>""" if scope else ''}
        </dependency>
'''
    args = ''.join(f'                        <arg>-opt-in={o}</arg>\n' for o in opt_ins(path))
    gradle = dependencies_block(directory)[1]
    if 'coreDepsVersion' in gradle:  # built against the Gradle plugins' stdlib, with positional destructuring
        args += '                        <arg>-Xname-based-destructuring=only-syntax</arg>\n'
    if '-Xallow-kotlin-package' in gradle:
        args += '                        <arg>-Xallow-kotlin-package</arg>\n'
    kotlin = f'''        <plugins>
            <plugin>
                <groupId>org.jetbrains.kotlin</groupId>
                <artifactId>kotlin-maven-plugin</artifactId>
                <configuration>
                    <args combine.children="append">
{args}                    </args>
                </configuration>
            </plugin>
        </plugins>
''' if args else ''
    resources = '''        <resources>
            <resource>
                <directory>resources</directory>
            </resource>
        </resources>
''' if os.path.isdir(f'{ROOT}/{directory}/resources') else ''
    return f'''<?xml version="1.0" encoding="UTF-8"?>
<!-- Generated by consulo-internal/remap/genpom.py from build.gradle.kts ({path}) -->
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>consulo.kotlin</groupId>
        <artifactId>consulo.kotlin.parent</artifactId>
        <version>3-SNAPSHOT</version>
        <relativePath>{'../' * depth}pom.xml</relativePath>
    </parent>

    <artifactId>{artifact_id(directory)}</artifactId>

    <build>
        <sourceDirectory>src</sourceDirectory>
{resources}{kotlin}    </build>

    <dependencies>
{deps}        <dependency>
            <groupId>${{project.groupId}}</groupId>
            <artifactId>consulo.kotlin.intellij-stubs</artifactId>
            <version>${{project.version}}</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
</project>
'''


def main():
    args = sys.argv[1:]
    closure = '--closure' in args
    roots = [a for a in args if a.startswith(':')]
    order, seen = [], set()
    in_reactor = set(re.findall(r'^\s*<module>([^<]+)</module>', open(f'{ROOT}/pom.xml').read(), re.M))

    def visit(p):
        if p in seen:
            return
        seen.add(p)
        deps = project_deps(p)
        if deps is None:
            print(f'warning: no build.gradle.kts for {p}', file=sys.stderr)
            return
        if closure:
            for d, _ in deps:
                if module_dir(d) not in in_reactor or d in roots:
                    visit(d)
        order.append(p)

    if '--missing' in args:
        by_dir = {v: k for k, v in OVERRIDES.items()}
        roots += [by_dir.get(d, ':' + d.replace('/', ':')) for d in sorted(in_reactor)
                  if not os.path.exists(f'{ROOT}/{d}/pom.xml')]
    for r in roots:
        visit(r)
    for p in order:
        f = f'{ROOT}/{module_dir(p)}/pom.xml'
        if os.path.exists(f):
            continue
        content = pom(p)
        open(f, 'w').write(content)
    for p in order:
        if module_dir(p) not in in_reactor:
            print(f'        <module>{module_dir(p)}</module>')


main()
