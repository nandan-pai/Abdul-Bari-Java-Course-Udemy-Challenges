public class MethodsPractice {

	//while using object no need of "static"
	//Otherwise "static" should be used
	int maxVal(int a , int b) {
		return (a>b)?a:b;
	}
	
	public static void main(String[] args) {
		/*int x = 10, y = 15, c;
		c = maxVal(x, y);
		System.out.println("Max value is : " + c);*/
		
		int a = 10, b = 15;
		MethodsPractice mp = new MethodsPractice();
		System.out.println("Max value is : " + mp.maxVal(a, b));
	}

}
