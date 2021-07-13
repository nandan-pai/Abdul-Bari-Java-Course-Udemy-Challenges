import java.util.Scanner;

public class NestedLoopChallenge3 {
	public static void main(String [] args) { 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				if(j >= i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n  ; j++) {
				if(j >= n - i + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		System.out.println();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n - i  ; j++) {
				System.out.print("  ");
			}
			
			for(int k = 1 ; k <= (2 * i) - 1 ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = n; i > 1 ; i--) {
			for(int j = 1 ; j <= n - i + 1 ; j++) {
				System.out.print("  ");
			}
			for(int k = (2 * i) - 2 ; k > 1 ; k--) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}
}
