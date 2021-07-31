import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter number to check if it is perfect number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();		
		input.close();
		System.out.print("Is " + num + " a perfect number? : " + PerfectNumber.isPerfectNumber(num));

	}
}