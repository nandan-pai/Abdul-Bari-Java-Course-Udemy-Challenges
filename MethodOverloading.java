public class MethodOverloading {

	static int maximum(int a , int b) {
		return a > b? a : b; 
	}
	
	static int maximum(int a, int b , int c) {
		return (a > b && a > c)? a: (b > c)?b : c; 
	}
	
	static float maximum(float a , float b) {
		return a > b ? a : b;
	}
	
	public static void main(String[] args) {
		int n1 = 10, n2 = 20, n3 = 2;
		float num1 = 10f, num2 = 1f;
		int maxOfTwo = maximum(n1, n2);
		int maxOfThree = maximum(n1, n2, n3);
		float maxFloat = maximum(num1,  num2);
		
		System.out.println("Max value out of " + n1 + " " + n2 + " is " + maxOfTwo);
		System.out.println("Max value out of " + n1 + " " + n2 + " and " + n3 + " is " + maxOfThree);
		System.out.println("Max value out of " + num1 + " " + num2  + " is " + maxFloat);
	}

}
