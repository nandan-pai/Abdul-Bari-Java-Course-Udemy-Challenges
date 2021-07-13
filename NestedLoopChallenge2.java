import java.util.Scanner;

public class NestedLoopChallenge2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		int k = 1;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.format("%02d ", k);
				k++;
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
