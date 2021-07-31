class CheckEquality {
	public static void printEqual(int a, int b, int c) {
		if(a < 0 || b < 0 || c < 0) System.out.println("Invalid Value");
		else if(a == b && b == c) System.out.println("All nummbers are equal");
		else if(a == b && b != c || a != b && b == c || a == c && c != b) System.out.println("Neither equal not different");
		else System.out.println("All are different");
	}
}