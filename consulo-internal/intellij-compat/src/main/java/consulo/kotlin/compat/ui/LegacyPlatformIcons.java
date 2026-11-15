package consulo.kotlin.compat.ui;

import consulo.platform.base.icon.PlatformIconGroup;
import consulo.ui.image.Image;

/** IntelliJ {@code com.intellij.util.PlatformIcons}: icon constants (Consulo's legacy interface has Swing icons). */
public interface LegacyPlatformIcons {
    Image PUBLIC_ICON = PlatformIconGroup.nodesC_public();
    Image PRIVATE_ICON = PlatformIconGroup.nodesC_private();
    Image PROTECTED_ICON = PlatformIconGroup.nodesC_protected();
    Image PACKAGE_LOCAL_ICON = PlatformIconGroup.nodesC_plocal();
    Image CLASS_ICON = PlatformIconGroup.nodesClass();
    Image INTERFACE_ICON = PlatformIconGroup.nodesInterface();
    Image ENUM_ICON = PlatformIconGroup.nodesEnum();
    Image ANNOTATION_TYPE_ICON = PlatformIconGroup.nodesAnnotationtype();
    Image ABSTRACT_CLASS_ICON = PlatformIconGroup.nodesAbstractclass();
    Image METHOD_ICON = PlatformIconGroup.nodesMethod();
    Image ABSTRACT_METHOD_ICON = PlatformIconGroup.nodesAbstractmethod();
    Image FUNCTION_ICON = PlatformIconGroup.nodesFunction();
    Image FIELD_ICON = PlatformIconGroup.nodesField();
    Image PROPERTY_ICON = PlatformIconGroup.nodesProperty();
    Image PARAMETER_ICON = PlatformIconGroup.nodesParameter();
    Image VARIABLE_ICON = PlatformIconGroup.nodesVariable();
    Image PACKAGE_ICON = PlatformIconGroup.nodesPackage();
}
