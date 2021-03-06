public class RangeSum {

	public static void main(String[] args){

		int[] array = {1, 2, 3, 4, 5, 6};

		System.out.println(sum(array));
	}

	public static int sum(int[] numbers){
		return rangeSum(numbers, 0, numbers.length - 1);
	}

	public static int rangeSum(int[] numbers, int start, int end){

		//Base case
		if(start > end){
			return 0;
		}

		//Recursive case
		return numbers[start] + rangeSum(numbers, start + 1, end);

	}
}
