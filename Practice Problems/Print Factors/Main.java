import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter a number to find its factors: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		PrintFactors.printFactors(num);
	}
}