package black.door.function;

import java.util.function.Function;

/**
 * Created by nfischer on 9/19/2015.
 */
public interface Supplier<T>
		extends java.util.function.Supplier<T>, Function<Void, T> {
	default T apply(Void v){
		return get();
	}
}
