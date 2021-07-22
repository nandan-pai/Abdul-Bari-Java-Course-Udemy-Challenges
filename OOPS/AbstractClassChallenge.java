abstract class Shape {
	abstract public double perimeter();
	abstract public double area();
}

class CircleCls extends Shape {
	double radius;
	public CircleCls(double radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double area() {
		return Math.PI * radius * radius;
	}
}


class RectangleCls extends Shape {
	double length, breadth;
	public RectangleCls(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public double perimeter() {
		return 2 * ( length + breadth);
	}
	
	public double area() {
		return length * breadth;
	}
}

public class AbstractClassChallenge {
	public static void main(String[] args) {
		Shape sh = new CircleCls(10);
		System.out.println("Area = " + sh.area());
		System.out.println("Perimeter = " + sh.perimeter());
		
		System.out.println();
		
		Shape sh2 = new RectangleCls(10,20);
		System.out.println("Area = " + sh2.area());
		System.out.println("Perimeter = " + sh2.perimeter());
		
	}
}