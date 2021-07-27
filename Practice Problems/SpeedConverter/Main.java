import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter distance in kmph: ");
		Scanner input = new Scanner(System.in);
		double kmph = input.nextDouble();
		input.close();
		SpeedConverter.printConversion(kmph);
	}
}