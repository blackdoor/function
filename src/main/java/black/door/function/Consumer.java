package black.door.function;

import java.util.function.Function;

/**
 * Created by nfischer on 9/19/2015.
 */
public interface Consumer<T>
		extends java.util.function.Consumer<T>, Function<T, Void> {

	default Void apply(T t){
		accept(t);
		return null;
	}
}
