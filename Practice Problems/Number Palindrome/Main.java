import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter a number to check if it is palindrome: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		if(NumberPalindrome.isPalindrome(num)) {
			System.out.println(num + " is palindrome");		
		} else {
			System.out.println(num + " is not palindrome");		
		}
	}
}