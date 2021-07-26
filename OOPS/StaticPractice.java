class Test1 {
	static int x = 10;
	int y = 20;
	void show() {
		System.out.println(x + " " + y);
	}
	static void display() {
		System.out.println(x + " Hello");
		//System.out.println(y); //Accessing non-static varibale from static method is not possible
	}
}


public class StaticPractice {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.show();
		t1.x = 30;
		t1.y = 50;
		
		Test1 t2 = new Test1();
		//Observe t2.x changed to 30 but t2.y is 20
		t2.show();
		
		
		//Static method can be accessed without object
		Test1.display();
	}
}