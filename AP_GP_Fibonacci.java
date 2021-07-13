import java.util.Scanner;

public class AP_GP_Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*System.out.println("Enter value of a, d and n for Arithmetic Progression: ");
		int a = in.nextInt();
		int d = in.nextInt();
		int n = in.nextInt();
		//System.out.println(a + " ");
		for(int i = 0 ; i < n  ; i++) {
			System.out.print(a + (i * d) + " ");
		}
		
		System.out.println("Enter value of a, r and n for Geometric Progression: ");
		int a1 = in.nextInt();
		int r = in.nextInt();
		int n1 = in.nextInt();
		in.close();

		for(int i = 0 ; i < n1 ; i++) {
			System.out.print((a1 * (int)Math.pow(r, i)) + " ");
		}
		*/
		
		
		System.out.println("Enter value of n for number of terms in fibonacci series: ");
		int n2 = in.nextInt();
		in.close();
		int first = 0, second = 1;
		int next = second;
		int prev = first;
		for(int i = 1 ; i <= n2 ; i++) {
			if(i == 1) {
				System.out.print(first + " ");
			} else if(i == 2) {
				System.out.print(second + " ");
			} else {
				int temp = next;
				next += prev; 
				prev = temp;
				System.out.print(next + " ");
				
			}
		}
	}
}