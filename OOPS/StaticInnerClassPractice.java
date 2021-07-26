class OuterClass1 {
	int x = 10;
	static int y = 20;
	
	static class My {
		public void display() {
			//System.out.println(x); //Cannot access non-static member 
			System.out.println(y);
		}
	}
}


public class StaticInnerClassPractice {
	public static void main(String[] args) {
		OuterClass1.My m = new OuterClass1.My();
		m.display();
	}
}