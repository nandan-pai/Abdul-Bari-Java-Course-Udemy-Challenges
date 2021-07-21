class Overload {
	public int max(int a, int b) {
		return a > b ? a : b;
	}
	
	public int max(int a, int b , int c) {
		if(a > b && a > c) {
			return a;
		} else if(b > c) {
			return b;
		}return c;
	}
}

class OverrideSuper {
	public void output() {
		System.out.println("Super Class Output");
	}
}

class OverrideSub extends OverrideSuper{
	public void output() {
		System.out.println("Sub Class Output");
	}
}

public class PolymorphismOverloadingOverriding {
	public static void main(String[] args) {
		Overload maximum = new Overload();
		
		int m = maximum.max(10, 20);
		System.out.println("Max = " + m);
		
		m = maximum.max(30, 40, 10);
		System.out.println("Max = " + m);

		System.out.println();
		OverrideSuper s = new OverrideSub();
		s.output();
	}
}