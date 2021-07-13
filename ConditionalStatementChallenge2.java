import java.util.Scanner;

public class ConditionalStatementChallenge2 {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		String numString = in.next();
		in.close();
		int radix = 0;
		boolean invalid = true;
		if(numString.matches("[01]+")) {
			radix = 2;
			invalid = false;
		}
		else if(numString.matches("[0-7]+")) {
			radix = 8;
			invalid = false;
		}
		else if(numString.matches("[0-9]+")) {
			radix = 10;
			invalid = false;
		}
		else if(numString.matches("[0-9A-F]+")) {
			radix = 16;
			invalid = false;
		}
		else {
			System.out.println("Invalid number");
			invalid = true;
		}
		
		if(invalid == false) {
			System.out.println("Radix is: " + radix);
		}
		
	}

}
