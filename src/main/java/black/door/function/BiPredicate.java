package black.door.function;

import java.util.function.BiFunction;

/**
 * Created by nfischer on 9/19/2015.
 */
public interface BiPredicate<T, U>
		extends java.util.function.BiPredicate<T, U>, BiFunction<T, U, Boolean> {
	default Boolean apply(T t, U u){
		return test(t, u);
	}
}
