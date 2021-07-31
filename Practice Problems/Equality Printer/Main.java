import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter three numbers: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		CheckEquality.printEqual(a,b,c);
	}
}