import java.util.Scanner;

public class ArrayChallenge2Part2 {

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
			
			System.out.println("Enter position in which new element to be inserted: ");
			int pos = in.nextInt();
			if(len == n || pos > n || pos < 1) {
				System.out.println("Element insertion not possible");
			} else {
				System.out.println("Enter element to be inserted: ");
				int newElement = in.nextInt();
				
				System.out.println("Array before insertion: ");
				for(int x : A) {
					System.out.print(x  + " ");
				}
				System.out.println();
				
				for(int i = len ; i >= pos  ; i--) {
					A[i] = A[i - 1];
				}			
				A[pos - 1] = newElement;
			} 
		} else {
			System.out.println("Inserting element is not possible since array length is smaller than the requirement");
		}

		in.close();
		System.out.println("Final Array : ");
		for(int x : A) {
			System.out.print(x  + " ");
		}
	}

}
