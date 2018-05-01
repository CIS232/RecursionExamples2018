import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumbersTest {

	@Test
	public void fibonacci() {
		assertEquals(13, FibonacciNumbers.fibonacci(7));
	}
}