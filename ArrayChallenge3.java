import java.util.Scanner;

public class ArrayChallenge3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = in.nextInt();
		
		System.out.println("Enter array elements for array A : ");
		int A[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			A[i] = in.nextInt();
		}
		in.close();
		
		int B[] = new int[A.length];
		for(int i = 0 ; i <  A.length ; i++) {
			B[i] = A[i];
		}
		
		System.out.print("Array B after copying elements from array A: ");
		for(int x: A) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//reverse copying
		for(int i = 0 ; i <  A.length ; i++) {
			B[A.length - i - 1] = A[i];
		}
		
		System.out.print("Array B after reverse copying elements from array A: ");
		for(int x: B) {
			System.out.print(x + " ");
		}
		
	}

}
