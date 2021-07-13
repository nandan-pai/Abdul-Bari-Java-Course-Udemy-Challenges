import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		in.close();
		boolean isLeap = false;
		
		if(year % 4 == 0 && year % 100 != 0) {
			isLeap = true;
		}
		else if (year % 400 == 0) {
			isLeap = true;
		}
		else {
			isLeap = false;
		}
		if(isLeap) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
	}

}
