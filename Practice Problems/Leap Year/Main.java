import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter year: ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		boolean	isLeap= LeapYear.isLeapYear(year);
		if(isLeap) {
			System.out.println(year + " is leap year");
		} else {
			System.out.println(year + " is not leap year");	
		}
	}
}