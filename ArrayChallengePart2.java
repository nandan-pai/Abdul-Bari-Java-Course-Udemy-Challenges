import java.util.Scanner;

public class ArrayChallengePart2 {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		int n = in.nextInt();
		
		int A[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			A[i] = in.nextInt();
		}
		
		int max, secondMax;
		max = secondMax = A[0];
		in.close();
		for(int i = 1 ; i < n ; i++) {
			if(A[i] > max) {
				secondMax = max;
				max = A[i];
			} else if(A[i] > secondMax) {
				secondMax = A[i];
			}
		}
		System.out.println("Max is : " + max);
		System.out.println("Second Max is : " + secondMax);
	}

}
