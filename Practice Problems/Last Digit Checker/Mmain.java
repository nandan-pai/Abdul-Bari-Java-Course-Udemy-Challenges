import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter three numbers in range 10-1000 to check if any two last digits are same : ");
		Scanner input = new Scanner(System.in);
		int a = nextInt();
		int b = nextInt();
		int c = nextInt();
		input.close();
 		boolean check = LastDigitChecker.hasSameLastDigit(a, b, c);
		if(check) {
			System.out.println("Yes, atleast two numbers have same last digit");
		} else {
			System.out.println("Either there is no same last digit or you've given inalid input");
		}

	}
}