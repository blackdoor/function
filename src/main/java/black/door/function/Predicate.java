package black.door.function;

import java.util.function.Function;

/**
 * Created by nfischer on 9/19/2015.
 */
public interface Predicate<T>
		extends java.util.function.Predicate<T>, Function<T, Boolean> {
	default Boolean apply(T t){
		return test(t);
	}

}
