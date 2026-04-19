package consulo.kotlin.core.helper;

import consulo.annotation.component.ComponentScope;
import consulo.annotation.component.ServiceAPI;
import consulo.application.Application;
import consulo.localize.LocalizeValue;

/**
 * Application-scoped service that supplies localized display strings for the
 * remapped Kotlin language and file types.
 *
 * The remapped Kotlin jar calls into this service via bytecode injected by
 * maven-java-bytecode-remap-plugin (see {@code <overrideMethod><body>...</body></overrideMethod>}
 * in {@code consulo-internal/remap/remap.xml}) to replace the hardcoded
 * {@code "Kotlin"} strings returned by {@code KotlinLanguage#getDisplayName()} and
 * {@code KotlinFileType#getDescription()}. The implementation lives in the
 * top-level Consulo plugin that depends on this module.
 */
@ServiceAPI(ComponentScope.APPLICATION)
public interface KotlinLocalizeService {
    static KotlinLocalizeService getInstance() {
        return Application.get().getInstance(KotlinLocalizeService.class);
    }

    LocalizeValue getKotlinLanguageDisplayName();

    LocalizeValue getKotlinFileTypeDescription();
}
