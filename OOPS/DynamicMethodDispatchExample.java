class Super1 {
	public void method1() {
		System.out.println("Super method1");
	}
	
	public void method2() {
		System.out.println("Super method2");
	}
}

class Sub1 extends Super1 {
	public void method2() {
		System.err.println("Sub method2");
	}
	
	public void method3() {
		System.out.println("Sub method3");
	}
}


public class DynamicMethodDispatchExample {
	public static void main(String[] args) {
		Super1 sp = new Super1();
		sp.method1();
		sp.method2();
		
		System.out.println();
		
		Super1 sp1 = new Sub1();
		sp1.method1();
		sp1.method2();
		
		System.out.println();
		
		Sub1 sb = new Sub1();
		sb.method1();
		sb.method2();
		sb.method3();
	}
}