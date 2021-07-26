class Outer {
	int x = 10;
	class Inner {
		int y = 20;
		public void displayinner() {
			System.out.println(x + " " + y);
			System.out.println("Inner Class display method");
		}
	}
	
	public void display() {
		System.out.println("Outer Class display method");
		System.out.println(x);
		Inner i = new Inner();
		i.displayinner();
		System.out.println(i.y);
	}
}

public class NestedInnerClassPractice {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.display();
		
		System.out.println();
		
		Outer.Inner i = new Outer().new Inner();
		System.out.println(i.y);
		i.displayinner();
	}
}