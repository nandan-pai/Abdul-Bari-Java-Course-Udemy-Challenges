import java.util.Scanner;

public class MethodOverloadChallenge2 {

	static int input() {
		System.out.print("Enter number: ");
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		//in.close();
		return n;
	}
	
	static int[] inputArr(int n) {
		Scanner in = new Scanner(System.in);
		int A[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			A[i] = in.nextInt();
		}
		in.close();
		return A;
	}
	
	static int reverse(int num) {
		int n = num, rev = 0;
		while(n != 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		return rev;
	}
	
	static int[] reverse(int A[]) {
		for(int i = 0 ; i <= A.length / 2 ; i++) {
			int temp = A[i];
			A[i] = A[A.length - i - 1];
			A[A.length - i - 1] = temp;
		}
		return A;
	}
	
	static void display(int n) {
			System.out.println("Reversed number is: " + n);		
	}
	
	static void display(int n , int A[]) {
		for(int x: A) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	static void display() {
		System.out.println("Invalid Choice");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter choice:\n 1.Reversing number \n 2.Reversing Array");
		int choice = input();
		
		if(choice == 1) {
			System.out.println("Enter number to be reversed: ");
			int n = input();
			n = reverse(n);
			display(n);
		} else if(choice == 2) {
			System.out.println("Enter array length: ");
			int n = input();
			int A[] = new int[n];
			System.out.println("Enter array elements: ");
			A = reverse(A);
			display(n, A);
		} else {
			display();
		}
	}
}