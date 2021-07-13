public class ArrayPractice {

	public static void main(String[] args) {
		int A[] = new int[5];
		System.out.println(A.length);
		
		int B[] = {1,2,3,4,5};
		for(int i = 0 ; i < B.length ; i++)
			System.out.print(B[i] + " ");
		
		System.out.println();
		//foreach loop
		for(int x : B) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		for(int x:B) {
			System.out.print(x++ + " ");   
		}
		System.out.println();
		
		for(int x:B) {
			System.out.print(++x + " ");   
		}
		System.out.println();

		
		for(int x:B) {
			System.out.print(x + " ");   
		}
		System.out.println();

		
		for(int i = 0 ; i < B.length ; i++) {
			System.out.print(B[i]++ + " ");   
		}
		System.out.println();

		for(int x:B) {
			System.out.print(x + " ");   
		}
		System.out.println();
	}

}
