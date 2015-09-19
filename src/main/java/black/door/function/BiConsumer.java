package black.door.function;

import java.util.function.BiFunction;

/**
 * Created by nfischer on 9/19/2015.
 */
public interface BiConsumer<T, U>
		extends java.util.function.BiConsumer<T, U>, BiFunction<T, U, Void> {
	default Void apply(T t, U u){
		accept(t, u);
		return null;
	}
}
