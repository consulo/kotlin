package consulo.kotlin.compat.completion;

import consulo.language.editor.completion.lookup.InsertHandler;
import consulo.language.editor.completion.lookup.InsertionContext;
import consulo.language.editor.completion.lookup.LookupElement;
import consulo.language.editor.completion.lookup.LookupElementPresentation;
import consulo.language.editor.completion.lookup.LookupElementRenderer;

/**
 * IntelliJ {@code LookupElementDecorator}: Consulo's, with IntelliJ's separate insert handlers of the decorator and of
 * the delegate. Calls of IntelliJ's static withInsertHandler/withRenderer are redirected to withDecoratorInsertHandler/
 * withDecoratorRenderer (Consulo's, inherited, return Consulo decorators).
 */
public abstract class LookupElementDecorator<T extends LookupElement> extends consulo.language.editor.completion.lookup.LookupElementDecorator<T> {
    protected LookupElementDecorator(T delegate) {
        super(delegate);
    }

    /** The insert handler that replaces the delegate's insertion, called with this decorator. */
    public InsertHandler<? super LookupElementDecorator<T>> getDecoratorInsertHandler() {
        return null;
    }

    /** The insert handler that replaces the delegate's insertion, called with the delegate. */
    public InsertHandler<? super T> getDelegateInsertHandler() {
        return null;
    }

    @Override
    public void handleInsert(InsertionContext context) {
        InsertHandler<? super LookupElementDecorator<T>> decoratorHandler = getDecoratorInsertHandler();
        if (decoratorHandler != null) {
            decoratorHandler.handleInsert(context, this);
            return;
        }
        InsertHandler<? super T> delegateHandler = getDelegateInsertHandler();
        if (delegateHandler != null) {
            delegateHandler.handleInsert(context, getDelegate());
            return;
        }
        super.handleInsert(context);
    }

    public static <T extends LookupElement> LookupElementDecorator<T> withDelegateInsertHandler(T element, InsertHandler<? super T> insertHandler) {
        return new LookupElementDecorator<>(element) {
            @Override
            public InsertHandler<? super T> getDelegateInsertHandler() {
                return insertHandler;
            }
        };
    }

    public static <T extends LookupElement> LookupElementDecorator<T> withDecoratorInsertHandler(T element, InsertHandler<? super LookupElementDecorator<T>> insertHandler) {
        return new LookupElementDecorator<>(element) {
            @Override
            public InsertHandler<? super LookupElementDecorator<T>> getDecoratorInsertHandler() {
                return insertHandler;
            }
        };
    }

    public static <T extends LookupElement> LookupElementDecorator<T> withDecoratorRenderer(T element, LookupElementRenderer<? super LookupElementDecorator<T>> renderer) {
        return new LookupElementDecorator<>(element) {
            @Override
            public void renderElement(LookupElementPresentation presentation) {
                renderer.renderElement(this, presentation);
            }
        };
    }
}
