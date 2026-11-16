package consulo.kotlin.compat.psi;

import consulo.language.psi.ElementDescriptionLocation;
import consulo.language.psi.PsiElement;
import consulo.localize.LocalizeValue;

/**
 * IntelliJ's {@code ElementDescriptionProvider} describes with a string ({@code getElementDescription}, renamed to
 * {@link #getElementDescriptionText} by remap.xml); Consulo's with a {@link LocalizeValue}, empty for none.
 */
public interface ElementDescriptionProvider extends consulo.language.psi.ElementDescriptionProvider {
    String getElementDescriptionText(PsiElement element, ElementDescriptionLocation location);

    @Override
    default LocalizeValue getElementDescription(PsiElement element, ElementDescriptionLocation location) {
        String description = getElementDescriptionText(element, location);
        return description == null ? LocalizeValue.empty() : LocalizeValue.of(description);
    }
}
