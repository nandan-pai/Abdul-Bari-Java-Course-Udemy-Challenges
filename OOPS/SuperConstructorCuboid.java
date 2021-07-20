class Rectangle3 {
	int length, breadth;
	public Rectangle3() {
		length = 1;
		breadth = 1;
	}
	public Rectangle3(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
}

class Cuboid1 extends Rectangle3 {
	int height;
	public Cuboid1() {
		height = 1;
	}
	public Cuboid1(int height) {
		this.height = height;
	}
	public Cuboid1(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
	public int volume() {
		return length * breadth * height;
	}
}

public class SuperConstructorCuboid {
	public static void main(String[] args) {
		Cuboid1 c = new Cuboid1(3,4,5);
		System.out.println("Volume of cuboid where length = " + c.length + " breadth = " + c.breadth + " height = " + c.height + " is " + c.volume());
	}
}