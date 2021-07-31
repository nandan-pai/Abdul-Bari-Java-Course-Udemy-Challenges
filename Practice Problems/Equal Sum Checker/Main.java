import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter three numbers: ");
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int ans = input.nextInt();
		boolean check = IsSumEqual.hasEqualSum(n1, n2, ans);

		if(check) {
			System.out.println(n1 + " + " + n2 + " = " + ans);
		} else {
			System.out.println(n1 + " + " + n2 + " != " + ans);
		}
	}
}