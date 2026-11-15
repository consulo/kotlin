package consulo.kotlin.compat.search;

import consulo.application.Application;
import consulo.application.util.query.AbstractQuery;
import consulo.application.util.query.Query;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

/** IntelliJ {@code com.intellij.model.search.SearchService}: the results of the {@link Searcher}s for some parameters. */
public final class SearchService {
    private static final SearchService INSTANCE = new SearchService();

    private final Map<Class<?>, Class<?>> myParametersClasses = new ConcurrentHashMap<>();

    private SearchService() {
    }

    public static SearchService getInstance() {
        return INSTANCE;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public <R> Query<R> searchParameters(SearchParameters<R> parameters) {
        List<Query<? extends R>> queries = new ArrayList<>();
        for (Searcher searcher : Application.get().getExtensionList(Searcher.class)) {
            Class<?> parametersClass = myParametersClasses.computeIfAbsent(searcher.getClass(), SearchService::parametersClass);
            if (parametersClass.isInstance(parameters)) {
                queries.addAll(searcher.collectSearchRequests(parameters));
            }
        }
        return new AbstractQuery<>() {
            @Override
            protected boolean processResults(Predicate<? super R> consumer) {
                for (Query<? extends R> query : queries) {
                    if (!delegateProcessResults((Query<R>) query, consumer)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    /** The {@code P} of a searcher class: the type argument it gives {@link Searcher}. */
    private static Class<?> parametersClass(Class<?> searcherClass) {
        for (Class<?> c = searcherClass; c != null; c = c.getSuperclass()) {
            for (Type type : c.getGenericInterfaces()) {
                if (type instanceof ParameterizedType parameterized && parameterized.getRawType() == Searcher.class) {
                    Type argument = parameterized.getActualTypeArguments()[0];
                    if (argument instanceof Class<?> argumentClass) {
                        return argumentClass;
                    }
                    if (argument instanceof ParameterizedType parameterizedArgument) {
                        return (Class<?>) parameterizedArgument.getRawType();
                    }
                }
            }
        }
        return Void.class;
    }
}
