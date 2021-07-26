//final class FinalTest => cannot be inherited
class FinalTest {
	public void display() {
		System.out.println("Inside display method");
	}
	
 	public final void show() {
		System.out.println("Inside final method");
	}
}

class FinalTestSub extends FinalTest {
	public void display() {
		System.out.println("Inside display method in sub class");
	}
	
	/*public void show() {
		
	}*/
}

public class FinalDemo {
	//final variables are class members / properties they should be initialized while declared
	//If you want to declare them later 
	//1) then variable should be made static and can be declared in static block later
	//2) then declare in instance block
	//3) then use  constructor of class to initialize
	final float PI = 3.142f;
	
	//static final float PI;
	/*static {
	 * 	PI = 3.142f;
	 * } 
	*/
	
	//Instance block
	/*{
		PI = 3.142f;
	}*/
	
	//Class constructor
	/*
	 * FinalDemo() {
	 * 	PI = 3.142f;
	 * }
	 */
	
	public static void main(String[] args) {
		final float a;
		a = 132.123f;
		System.out.println(a);
	}
}