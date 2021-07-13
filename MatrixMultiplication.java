import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter order of matrix m and n for matrix 1: ");
		int m1 = in.nextInt();
		int n1 = in.nextInt();
		System.out.println("Enter order of matrix m and n for matrix 1: ");
		int m2 = in.nextInt();
		int n2 = in.nextInt();
		int A[][] = new int[m1][n1];
		int B[][] = new int[m2][n2];
		int C[][] = new int[m1][n2];
		
		if(n1 == m2) {
			System.out.println();
			System.out.println("Enter elements of matrix 1: ");
			for(int i = 0 ; i < m1 ; i++) {
				for(int j = 0 ; j < n1 ; j++) {
					A[i][j] = in.nextInt();
				}
			}
			
			System.out.println();
			System.out.println("Enter elements of matrix 2: ");
			for(int i = 0 ; i < m2 ; i++) {
				for(int j = 0 ; j < n2 ; j++) {
					B[i][j] = in.nextInt();
				}
			}
			in.close();
			
			for(int i = 0 ; i < m1 ; i++) {
				for(int j = 0 ; j < n2 ; j++) {
					C[i][j] = 0;
					for(int k = 0 ; k < m2 ; k++) {
						C[i][j] += A[i][k] * B[k][j];
					}
				}
			}
			
			System.out.println("Product matrix is: ");
			for(int x[] : C) {
				for(int y : x) {
					System.out.print(y + " ");
				}
				System.out.println();
			}
			
		} else  {
			System.out.println("Matrix multiplication for given order is not possible");
		}
	}

}
