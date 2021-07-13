import java.util.Scanner;

public class ForLoopChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number whose multiplication table is to be printed: ");
		int num = in.nextInt();
		
		for(int i = 1 ; i <= 10 ; i++ ) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
		
		System.out.println("Enter limit till where sum is to be compiled: ");
		int limit = in.nextInt();
		int sum = 0;
		
		for(int i = 1 ; i <= limit ; i++) {
			sum += i;
		}
		System.out.println("Sum from 1 to " + limit + " is = "  + sum);
		
		
		System.out.println("Enter number whose factorial is to be calculated: ");
		int factNum = in.nextInt();
		in.close();
		int fact = 1;
		for(int i = factNum ; i >= 1 ; i--) {
			fact *= i;
		}
		System.out.println("Factorial of " + factNum + " is " + fact);
	}

}
