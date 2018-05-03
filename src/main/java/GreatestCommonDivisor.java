public class GreatestCommonDivisor {
	public static void main(String[] args){
		System.out.println(gcd(192, 270));
	}

	public static int gcd(int a, int b){
		int remainder = a % b;
		if(remainder == 0){
			return b;
		}

		return gcd(b, remainder);
	}

}
