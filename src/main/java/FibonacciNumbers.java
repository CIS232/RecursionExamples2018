public class FibonacciNumbers {

	public static void main(String[] args){
		System.out.println(fibonacci(13));
	}

	/**
	 *
	 * @param n the position of the fibonacci number you would like
	 * @return the value of the fibonacci number at that position
	 */
	public static int fibonacci(int n){
		// Base case #1
		if(n == 0){
			return 0;
		}
		// Base case #2
		if(n == 1){
			return 1;
		}

		// Recursive case
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
