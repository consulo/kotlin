package consulo.kotlin.compat.components;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Remap target of {@code com.intellij.openapi.components.Service} (IntelliJ light services). Consulo has no light services:
 * the plugin's remap.xml declares them as services (@ServiceAPI/@ServiceImpl and a binding).
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Service {
    Level[] value() default {};

    enum Level {
        APP, PROJECT
    }
}
