"""Turn the Analysis API's IntelliJ service descriptors into Consulo services, in remap.xml.

Usage: python3 consulo-internal/remap/genservices.py
Reads the META-INF/analysis-api/*.xml descriptors of the engine modules and rewrites the parts of remap.xml between
the genservices markers: a @ServiceAPI modification per service API, an InjectingBinding per implementation, and a
TopicBinding per @TopicAPI interface.
"""
import os
import re
import xml.etree.ElementTree as ET

ROOT = os.path.abspath(os.path.join(os.path.dirname(__file__), '..', '..'))
REMAP = f'{ROOT}/consulo-internal/remap/remap.xml'
DESCRIPTORS = [
    'analysis/low-level-api-fir/resources/META-INF/analysis-api/low-level-api-fir.xml',
    'analysis/analysis-api-fir/resources/META-INF/analysis-api/analysis-api-fir.xml',
    'analysis/symbol-light-classes/resources/META-INF/analysis-api/symbol-light-classes.xml',
]
SKIP = {
    # analysis statistics are always off in Consulo
    'org.jetbrains.kotlin.analysis.low.level.api.fir.statistics.LLStatisticsService',
    'org.jetbrains.kotlin.analysis.api.fir.statistics.KaFirStatisticsService',
    # not built (decompiler, AST diff internals, light class support)
    'org.jetbrains.kotlin.analysis.decompiled.light.classes.origin.KotlinDeclarationInCompiledFileSearcher',
    'org.jetbrains.kotlin.analysis.decompiler.konan.KlibLoadingMetadataCache',
    'org.jetbrains.kotlin.analysis.api.fir.projectStructure.KaFirDanglingFileResolutionModeProvider',
    'org.jetbrains.kotlin.light.classes.symbol.SymbolKotlinAsJavaSupport',
}


P = 'org.jetbrains.kotlin.analysis.api.platform'
# Platform components the Consulo plugin implements (@ServiceImpl there) as project services
PLATFORM_APIS = [
    f'{P}.KotlinPlatformSettings',
    f'{P}.projectStructure.KotlinProjectStructureProvider',
    f'{P}.projectStructure.KotlinModuleDependentsProvider',
    f'{P}.declarations.KotlinDeclarationProviderFactory',
    f'{P}.declarations.KotlinDeclarationProviderMerger',
    f'{P}.declarations.KotlinAnnotationsResolverFactory',
    f'{P}.declarations.KotlinDirectInheritorsProvider',
    f'{P}.packages.KotlinPackageProviderFactory',
    f'{P}.packages.KotlinPackageProviderMerger',
    f'{P}.packages.KotlinPackagePartProviderFactory',
    f'{P}.modification.KotlinModificationTrackerFactory',
    f'{P}.lifetime.KotlinLifetimeTokenFactory',
    f'{P}.java.KotlinJavaModuleAnnotationsProvider',
    f'{P}.java.KotlinJavaModuleAccessibilityChecker',
]
# Platform components the Consulo plugin implements as application services
PLATFORM_APPLICATION_APIS = [
    'org.jetbrains.kotlin.analysis.decompiler.psi.BuiltinsVirtualFileProvider',
]
# Platform components with a ready implementation in the Analysis API
READY = [
    (f'{P}.lifetime.KotlinLifetimeTokenFactory', f'{P}.lifetime.KotlinReadActionConfinementLifetimeTokenFactory', 'PROJECT'),
]


def services():
    out = []
    for d in DESCRIPTORS:
        for e in ET.parse(f'{ROOT}/{d}').getroot().iter():
            if e.tag not in ('projectService', 'applicationService'):
                continue
            impl = e.get('serviceImplementation')
            if not impl or impl in SKIP:
                continue
            api = e.get('serviceInterface') or impl
            scope = 'PROJECT' if e.tag == 'projectService' else 'APPLICATION'
            out.append((api, impl, scope))
    return out


def replace_between(text, tag, body):
    begin, end = f'<!-- genservices:{tag}:begin -->', f'<!-- genservices:{tag}:end -->'
    pattern = re.compile(rf'([ \t]*){re.escape(begin)}.*?{re.escape(end)}', re.S)
    m = pattern.search(text)
    if not m:
        raise SystemExit(f'remap.xml has no {begin} marker')
    indent = m.group(1)
    return text[:m.start()] + f'{indent}{begin}\n{body}{indent}{end}' + text[m.end():]


def main():
    found = services() + READY
    mods, binds = '', ''
    apis = dict((a, s) for a, _, s in found)
    for api in PLATFORM_APIS:
        apis.setdefault(api, 'PROJECT')
    for api in PLATFORM_APPLICATION_APIS:
        apis.setdefault(api, 'APPLICATION')
    for api, scope in apis.items():
        mods += f'''        <class name="{api}">
            <addAnnotation type="consulo.annotation.component.ServiceAPI">
                <enum name="value" type="consulo.annotation.component.ComponentScope" value="{scope}"/>
            </addAnnotation>
        </class>
'''
    for api, impl, scope in found:
        binds += f'''            <binding impl="{impl}" api="{api}" scope="{scope}" type="service"/>
'''
    text = open(REMAP).read()
    text = replace_between(text, 'modifications', mods)
    text = replace_between(text, 'bindings', binds)
    # every interface remap.xml makes a topic gets a TopicBinding
    topics = re.findall(r'<class name="([\w.$]+)">\s*<addAnnotation type="consulo.annotation.component.TopicAPI"', text)
    text = replace_between(text, 'topics', ''.join(f'            <binding api="{t}" type="topicBinding"/>\n' for t in topics))
    open(REMAP, 'w').write(text)
    print(f'{len(found)} services, {len(topics)} topics')


main()
