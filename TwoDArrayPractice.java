import java.util.Scanner;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int A[][] = new int[m][n];
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				A[i][j] = in.nextInt();
			}
		}
		
		in.close();
		
		for(int x[] : A) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
