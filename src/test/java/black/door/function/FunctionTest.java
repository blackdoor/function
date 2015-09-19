package black.door.function;

import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

/**
 * Created by nfischer on 9/19/2015.
 */
public class FunctionTest {

	@Test
	public void testApply() throws Exception {
		StringBuilder sb = new StringBuilder();

		Function<String, String> f = e -> "function("+e+')';
		Supplier<String> s = () -> "Supplied";
		Consumer<String> c = e -> sb.append(e + " Consumed");
		Predicate<String> p = e -> !e.isEmpty();

		if(s.andThen(f).andThen(p).apply(null)){
			f.compose(s).andThen(c).apply(null);
		}

		assertEquals("function(Supplied) Consumed", sb.toString());
		assertEquals(f.apply(s.get()), f.compose(s).apply(null));
	}
}