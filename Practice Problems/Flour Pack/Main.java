import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter counts of big flour packs, small flour packs and goal: ");
		Scanner input = new Scanner(System.in);
		int bigpack = input.nextInt();
		int smallpack = input.nextInt();
		int goal = input.nextInt();
		input.close();
		System.out.println("Can be packed?" + FlourPack.canPack(bigpack, smallpack, goal));
	} 
}