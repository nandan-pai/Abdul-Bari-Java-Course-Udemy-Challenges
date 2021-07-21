class SuperClass1 {
	public void display() {
		System.out.println("Hello");
	}
}

class SubClass1 extends SuperClass1 {
	//Overriding SuperClass1.display()
	public void display() {
		System.out.println("Hello World");
	}
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		SuperClass1 sup = new SubClass1();
		
		/*Dynamic Method Dispatch:   A superclass reference holding object of subclass and when overrided method is called, 
		then the method of object will be called not the object of reference*/
		
		sup.display();
	}
}