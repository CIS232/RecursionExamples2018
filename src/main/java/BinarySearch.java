public class BinarySearch {

	public static void main(String[] args){
		int[] array = {1,2,3,4,6,7,8,9,10,12,14,20,24};
		System.out.println("Search for the value 4: " + binarySearch(array, 4));
		System.out.println("Search for the value 5: " + binarySearch(array, 5));
	}

	/**
	 * Uses binary search to find a value in an array.
	 * @param array An array with values sorted from lowest to highest
	 * @param searchValue A value to find in the array
	 * @return the index of the found value, or -1 if the value is not found
	 */
	public static int binarySearch(int[] array, int searchValue){
		return binarySearchRec(array, searchValue, 0, array.length - 1);
	}

	public static int binarySearchRec(int[] array, int searchValue, int start, int end){
		//Base cases
		//when we run out of elements to check
		if(start > end){
			return -1;
		}
		//when we find the value
		int middle = (start + end) / 2;
		if(searchValue == array[middle]){
			return middle;
		}

		//Recursive case
		if(searchValue < array[middle]){
			//check left side of array
			return binarySearchRec(array, searchValue, start, middle - 1);
		} else {
			//check right side of array
			return binarySearchRec(array, searchValue, middle + 1, end);
		}

	}
}
