import java.util.Scanner;

public class ForLoopChallange3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to print its digits: "); 
		int num = in.nextInt();
		
		while(num != 0) {
			int rem = num % 10;
			System.out.println(rem);
			num /= 10;
		}
		
		
		System.out.println("Enter number to count number of digits in it: ");
		int num2 = in.nextInt();
		int numcpy = num2;
		int count = 0;
		while(num2 != 0) {
			num2 = num2 % 10;
			count++;
			num2 /= 10;
		}
		System.out.println("Number of digits in number " + numcpy + " is " + count);
		
		
		System.out.println("Enter a number to check to check if it is armstrong number or not: ");
		int isArm = in.nextInt();
		int armCpy = isArm;
		int cubeOfDigits = 0;
		
		while(armCpy != 0) {
			int rem3 = armCpy % 10;
			cubeOfDigits += rem3 * rem3 * rem3;
			armCpy /= 10;
		}
		if(isArm == cubeOfDigits) {
			System.out.println(isArm + " is Armstrong number");
		} else { 
		System.out.println(isArm + " is not Armstrong number");
		}
		
		
		System.out.println("Enter number to reverse it: ");
		int toRev = in.nextInt();
		int rev = 0;
		int revCpy = toRev;
		while(revCpy != 0) {
			int rem4 = revCpy % 10;
			rev = rev * 10 + rem4;
			revCpy /= 10;
		}
		System.out.println("Reversed number of " + toRev + " is " + rev);
		
		
		System.out.println("Enter number to check if it is palimdrome: ");
		int toRev2 = in.nextInt();
		in.close();
		
		int rev2 = 0;
		int revCpy2 = toRev2;
		while(revCpy2 != 0) {
			int rem5 = revCpy2 % 10;
			rev2 = rev2 * 10 + rem5;
			revCpy2 /= 10;
		}
		
		if(("" + toRev2).matches("" + rev2)) {
			System.out.println(toRev2 + " is palimdrome");
		} else {
			System.out.println(toRev2 + " is not palimdrome");
		}
		
	}

}
