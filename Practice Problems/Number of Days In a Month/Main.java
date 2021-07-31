import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter month and year to get days in that month: ");
		Scanner input = new Scanner(System.in);
		int month = input.nextInt();
		int year = input.nextInt();
		input.close();
		int days = NumberOfDaysInAMonth.numOfDays(month, year);

		if(days == -1) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("Number of days in : " + month + "/" + year + " is " + days);
		}
	}
}