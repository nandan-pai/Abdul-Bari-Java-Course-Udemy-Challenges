public class RelationalOperators {

	public static void main(String[] args) {
		int a = 5, b = 10, c = 15;
		int largest;
		if(a > b && b > c) {
			largest = a;
		}
		else if(b > c) {
			largest = b;
		}
		else {
			largest = c;
		}
		System.out.println("Largest value is: " + largest);
	}

}
