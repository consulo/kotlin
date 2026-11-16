package consulo.kotlin.compat.psi;

/**
 * IntelliJ's view provider of injected fragments. Consulo's is internal; the Kotlin code that asks for one only
 * consults injected-file analysis promoters, which Consulo does not have, so no view provider is one here.
 */
public interface InjectedFileViewProvider {
}
