import java.util.Scanner;

public class NestedLoopChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				System.out.print((i + j) + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		int k = 1;
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				System.out.format("%02d ",k);
				k++;
			}
			System.out.println();
		}
	}

}
