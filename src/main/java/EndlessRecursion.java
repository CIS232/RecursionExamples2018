public class EndlessRecursion {

	public static void main(String[] args){
		message();
	}

	public static void message(){
		System.out.println("This is a recursive method.");
		message();
	}

}
