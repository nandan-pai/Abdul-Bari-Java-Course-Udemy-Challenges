import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter two numbers in range 10-99 to check if there is any common digit: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		input.close();
		boolean check = SharedDigit.hasSharedDigit(a, b);
		if(check) {
			System.out.println("Yes, there is atleast one common digit");
		} else {
			System.out.println("Either there is no common digit or you've given invalid input");
		}
	}	
}