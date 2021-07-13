import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter order of matrix m and n: ");
		int m = in.nextInt();
		int n = in.nextInt();
		int A[][] = new int[m][n];
		int B[][] = new int[m][n];
		int C[][] = new int[m][n];
		
		System.out.println();
		System.out.println("Enter elements of matrix 1: ");
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				A[i][j] = in.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Enter elements of matrix 2: ");
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				B[i][j] = in.nextInt();
			}
		}
		in.close();
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		
		
		System.out.println();
		System.out.println("Sum of matrices 1 and 2 is: ");
		for(int x[] : C) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
