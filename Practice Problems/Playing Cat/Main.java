import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter 1 if it is summer else enter 0:");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		boolean res; 
		if(choice == 1) {
			System.out.println("Enter temperature: ");
			int temperature = input.nextInt();
			res = IsCatPlaying.isCatPlaying(true, temperature);
		} else {
			System.out.println("Enter temperature: ");
			int temperature = input.nextInt();
			res = IsCatPlaying.isCatPlaying(false, temperature);
		}
		if(res) {
			System.out.println("Yes, cat is playing");
		} else {
			System.out.println("No, cat is not playing");
		}
	}
}