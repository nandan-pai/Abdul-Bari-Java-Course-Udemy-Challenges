class OuterCls {
	public void display() {
		class InnerCls {
			public void display() {
				System.out.println("Inner class display method");
			}
		}
		//InnerCls i = new InnerCls();
		//i.display();
		
		//OR
		
		//anonymous object
		new InnerCls().display();
	}
}

public class LocalInnerClassPractice {
	public static void main(String[] args) {
		OuterCls o = new OuterCls();
		o.display();
	}
}