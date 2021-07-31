import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter two floating point number to check if they are equal to three deciamls: ");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("" + DecimalComparator.areEqualByThree(a,b));
		
	}
}