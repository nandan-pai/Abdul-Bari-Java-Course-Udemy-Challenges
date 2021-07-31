import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter a number to print it in words: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		NumToWords.numberToWords(num);
	}
}