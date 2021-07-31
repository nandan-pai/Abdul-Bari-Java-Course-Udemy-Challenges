import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter a whole number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		NumberToWord.printNumberInWord(num);
	}
}