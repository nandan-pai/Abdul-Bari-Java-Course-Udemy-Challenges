import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter a number to check if it is prime: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		if(IsPrime.isPrime(num)) {
			System.out.println(num + " is prime number"); 
		} else  {
			System.out.println(num + " is not prime number"); 
		}
		
		System.out.println("Enter number till where prime numbers to be printed: ");
		int primeTill = input.nextInt();
		NPrimes.printNPrimes(primeTill);
		input.close();
	}
}