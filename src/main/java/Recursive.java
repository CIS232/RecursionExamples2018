/**
 * This class has a recursive method, message, that displays
 * a message n times.
 */

public class Recursive {
	public static void message(int n) {
		if (n > 0) {
			System.out.println("n: " + n);
			System.out.println("This is a recursive method.");
			message(n - 1);
		}
	}
}