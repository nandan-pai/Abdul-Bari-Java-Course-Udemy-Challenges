import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter a number to find sum of first and last digit: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		int sum = SumFirstAndLastDigit.sumFirstAndLastDigit(num);

		if(sum == -1) {
			System.out.println("Invalid input");
		} else {
			System.out.println("Sum of the given number's first and last digit is: " + sum);
		} 
	}		
}