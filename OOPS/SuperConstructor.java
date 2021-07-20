class Parent1 {
	public Parent1() {
		System.out.println("Non-param of Parent class");
	}
	
	public Parent1(int x) {
		System.out.println("Param of Parent class");
	}
}

class Child1 extends Parent1{
	public Child1() {
		System.out.println("Non-param of child class");
	}
	
	public Child1(int x, int y) {
		//super() must be called before any other statement
		//If super is not used non-param of Parent class will be called
		super(x);
		System.out.println("Param of Child class");
	}
}

public class SuperConstructor {
	public static void main(String[] args) {
		Child1 c = new Child1(10,20);
		
	}
}