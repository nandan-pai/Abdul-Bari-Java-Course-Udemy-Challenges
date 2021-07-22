abstract class SuperCls {
	public SuperCls() {
		System.out.println("Super Constructor");
	}
	
	public void method1() {
		System.out.println("Method 1 of Super Class");
	}
	
	abstract public void method2();
}

class SubCls extends SuperCls {
	public void method2() {
		System.out.println("Method 2 of Sub Class");
	}
}

public class AbstractClassExample {
	public static void main(String[] args) {
		//Cannot instantiate abstract class i.e. we cannot create object of abstract class
		/*SuperCls s = new SuperCls();
		s.method1();*/
		
		SuperCls s = new SubCls();
		s.method1();
		s.method2();
		
		System.out.println();
		
		SubCls sbcls = new SubCls();
		sbcls.method1();
		sbcls.method2();
	}
}