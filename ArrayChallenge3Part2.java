import java.util.Scanner;

public class ArrayChallenge3Part2 {

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
		int B[] = new int[2 * A.length];
		
		for(int i = 0 ; i < A.length ; i++) {
			B[i] = A[i];
		}
		
		A = B;
		B = null;
				
		System.out.println("Array elements from A (smaller array copied to bigger array B which will be pointing null later)for more space is: ");
		for(int x: A) {
			System.out.print(x + " ");
		}
	}

}
