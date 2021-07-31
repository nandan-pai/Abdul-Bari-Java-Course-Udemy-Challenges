import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter three number to check if any of them is teen number(i.e. between 13-19): ");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		boolean check = IsTeen.hasTeen(n1, n2, n3);
		
		if(check) {
			System.out.println("" + IsTeen.hasTeen(n1, n2, n3) + " there is teen number.");
		} else {
			System.out.println("" + IsTeen.hasTeen(n1, n2, n3) + " there is no teen number.");	
		}
	}
}
