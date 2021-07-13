import java.util.Scanner;

public class ArrayChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Enter size of array: ");
			int n = in.nextInt();
			
			int A[] = new int[n];
			for(int i = 0 ; i < n ; i++) {
				A[i] = in.nextInt();
			}
			//in.close();
	
			int sum = 0;
			
			for(int x : A) {
				sum += x;
			}
			System.out.print("Sum of : ");
			int i;
			for(i = 0 ; i < A.length - 1 ; i++) {
				System.out.print(A[i] + " + ");
			}
			System.out.println(A[i] + " = " + sum);
			
			System.out.print("Enter element to be searched: ");
			int search = in.nextInt();
			boolean flag = false;
			for(int j = 0 ; j < n ; j++) {
				if ( A[j] == search) {
					System.out.println(search + " found at position " + (j + 1));
					flag = true;
					break;
				}
			}
			if(!flag) {
				System.out.println(search + " not found in the array");
			}
		} finally {
			in.close();
		}
	}

}
