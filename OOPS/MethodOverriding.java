class SuperClass {
	public void display() {
		System.out.println("Hello");
	}
}


class SubClass extends SuperClass {
	//Overriding SuperClass.display()
	public void display() {
		System.out.println("Hello World");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		sup.display();
		
		SubClass sub = new SubClass();
		sub.display();
	}
}