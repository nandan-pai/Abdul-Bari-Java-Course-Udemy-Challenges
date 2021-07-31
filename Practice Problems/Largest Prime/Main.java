import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter number to find its largest prime factor: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();		
		input.close();	
		int largest = LargestPrime.getLargestPrime(num);
		if(largest == -1) {
			System.out.println("Invalid input");
		} else {
			System.out.println("Largest prime factor is: " + largest);
		}
	}
}