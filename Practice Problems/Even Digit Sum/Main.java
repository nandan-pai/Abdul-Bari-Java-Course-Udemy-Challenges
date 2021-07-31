import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter number to find sum of all its even digits: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		int sum = EvenDigitSum.getEvenDigitSum(num);
		if(sum == -1) {
			System.out.println("Invalid input");
		} else {
			System.out.println("Sum = " + sum);
		}
	}
}