import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter two numbers to find their GCD (num should be greater than 10): ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		int gcd = GCD.getgreatestCommonDivisor(a, b);
		if(gcd == -1) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("GCD of " + a + " and " + b + " is = " + gcd);
		}
	}
}