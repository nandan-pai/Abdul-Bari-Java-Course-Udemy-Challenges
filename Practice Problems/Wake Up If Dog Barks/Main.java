import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter true if dog is barking else enter false : ");
		Scanner input = new Scanner(System.in);
		boolean isBarking = input.nextBoolean();
		System.out.println("Enter current hour(In 24-hour format):");
		int hour = input.nextInt();
		boolean shouldIGetUp = DogWakesMeUp.shouldWakeUp(isBarking, hour);
		if(shouldIGetUp) {
			System.out.println("Get up! Dog is barking.");
		} else {
			System.out.println("No worries! Take rest");
		}	
	}
}
