class Rectangle4 {
	int length, breadth;
	int height = 100;
	public Rectangle4() {
		length = 1;
		breadth = 1;
	}
	public Rectangle4(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}

class Cuboid2 extends Rectangle4 {
	int height;
	public Cuboid2() {
		height = 1;
	}
	public Cuboid2(int height) {
		this.height = height;
	}
	public Cuboid2(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
	public void display() {
		System.out.println("Height in Parent class Rectangle is: " + super.height);
		System.out.println("Height in Child or currect class is: " + height);
		System.out.println("Height in Child or currect class can also be accessed by: " + this.height);
	}
}

public class ThisAndSuper {
	public static void main(String[] args) {
		Cuboid2 c = new Cuboid2(10,20,30);
		c.display();
	}
}