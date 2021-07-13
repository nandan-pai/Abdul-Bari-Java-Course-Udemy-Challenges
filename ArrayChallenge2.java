import java.util.Scanner;

public class ArrayChallenge2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = in.nextInt();
		
		int A[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			A[i] = in.nextInt();
		}
		in.close();
		
		System.out.println("Array before rotation is : ");
		for(int x : A) {
			System.out.print(x + " ");
		}
		System.out.println();
		int temp = A[0];
		for(int i = 1 ; i < n ; i++) {
			A[i-1] = A[i];
		}
		A[n-1] = temp;
		
		System.out.println("Array after left rotation is : ");
		for(int x : A) {
			System.out.print(x + " ");
		}
		
		
		temp = A[n-1];
		for(int i = n - 2 ; i >= 0 ; i--) {
			A[i + 1] = A[i];
		}
		A[0] = temp;
		System.out.println();

		System.out.println("Array after right rotation is : ");
		for(int x : A) {
			System.out.print(x + " ");
		}
		
		
	}
}
