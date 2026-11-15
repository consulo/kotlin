package consulo.kotlin.compat.ui;

import consulo.platform.base.icon.PlatformIconGroup;
import consulo.ui.image.Image;

import java.util.function.Supplier;

/** IntelliJ {@code com.intellij.ui.PlatformIcons}: the platform icons {@link IconManager#getPlatformIcon} returns. */
public enum PlatformIcons {
    Variable(PlatformIconGroup::nodesVariable),
    Class(PlatformIconGroup::nodesClass),
    AbstractClass(PlatformIconGroup::nodesAbstractclass),
    AnonymousClass(PlatformIconGroup::nodesAnonymousclass),
    Annotation(PlatformIconGroup::nodesAnnotationtype),
    Enum(PlatformIconGroup::nodesEnum),
    Record(PlatformIconGroup::nodesRecord),
    Interface(PlatformIconGroup::nodesInterface),
    ExceptionClass(PlatformIconGroup::nodesExceptionclass),
    AbstractException(PlatformIconGroup::nodesAbstractexception),
    ClassInitializer(PlatformIconGroup::nodesClassinitializer),
    Field(PlatformIconGroup::nodesField),
    Method(PlatformIconGroup::nodesMethod),
    AbstractMethod(PlatformIconGroup::nodesAbstractmethod),
    Function(PlatformIconGroup::nodesFunction),
    Lambda(PlatformIconGroup::nodesLambda),
    Parameter(PlatformIconGroup::nodesParameter),
    Property(PlatformIconGroup::nodesProperty),
    Local(PlatformIconGroup::nodesVariable),
    Package(PlatformIconGroup::nodesPackage),
    Static(PlatformIconGroup::nodesStatic),
    StaticMark(PlatformIconGroup::nodesStaticmark),
    FinalMark(PlatformIconGroup::nodesFinalmark),
    TestMark(PlatformIconGroup::nodesJunittestmark),
    TestStateRun(PlatformIconGroup::runconfigurationsTestmark),
    Private(PlatformIconGroup::nodesC_private),
    Protected(PlatformIconGroup::nodesC_protected),
    Public(PlatformIconGroup::nodesC_public),
    PackageLocal(PlatformIconGroup::nodesC_plocal),
    Tag(PlatformIconGroup::nodesTag),
    Folder(PlatformIconGroup::nodesFolder),
    TypeAlias(PlatformIconGroup::nodesTypealias);

    private final Supplier<Image> myImage;

    PlatformIcons(Supplier<Image> image) {
        myImage = image;
    }

    public Image getImage() {
        return myImage.get();
    }
}
