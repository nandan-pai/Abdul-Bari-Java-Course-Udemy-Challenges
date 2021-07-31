import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter minutes: ");
		Scanner input = new Scanner(System.in);	
		int minutes = input.nextInt();
		input.close();
		ToYearsAndDays.printYearsAndDays(minutes);
	}
}