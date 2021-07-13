import java.lang.*;
import java.util.*;

class Swap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int a = in.nextInt();
		System.out.print("Enter second number: ");
		int b = in.nextInt();
		in.close();
		System.out.println("Before swapping: a = " + a + " and b = " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping: a = " + a + " and b = " + b);
	}
}