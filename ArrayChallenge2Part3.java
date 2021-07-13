import java.util.Scanner;

public class ArrayChallenge2Part3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter overall length of array: ");
		int n = in.nextInt();
		int A[] = new int[n];
		
		System.out.println("Enter number of elements to be inserted in the array: ");
		int len = in.nextInt();
		if(len <= n) {
			System.out.println("Enter array elements : ");
			for(int i = 0 ; i < len ; i++) {
				A[i] = in.nextInt();
			}
			
			System.out.println("Enter position in which element to be deleted: ");
			int pos = in.nextInt();
			if(len == 0 || pos > n || pos < 1) {
				System.out.println("Element deletion not possible");
			} else {
				for(int i = pos - 1 ; i < len  ; i++) {
					A[i] = A[i + 1];
				}
			}
		} else {
			System.out.println("Invalid input");
		}

		in.close();
		System.out.println("Final Array : ");
		for(int x : A) {
			System.out.print(x  + " ");
		}
	}
}