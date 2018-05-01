public class FactorialDemo {

	public static void main(String[] args){
		System.out.println(factorial(4));
	}

	public static int factorial(int n){
		//Base case
		if(n == 0){
			return 1;
		}

		//Recursive case
		return n * factorial(n - 1);
	}
}
