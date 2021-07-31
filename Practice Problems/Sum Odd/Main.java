import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter start and end numbers to find sum of all odd numbers in that range: ");
		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		input.close();
		System.out.println("Sum = " + SumOfOdd.sumOdd(start, end));
	}
}