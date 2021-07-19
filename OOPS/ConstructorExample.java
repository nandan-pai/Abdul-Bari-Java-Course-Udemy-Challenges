class Rectangle2 {
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double lengthVal) {
		if(lengthVal < 0) {
			length = 0;
		} else {
			length = lengthVal;
		}	}
	
	public double getBreadth() {
		return breadth;
	}
	
	public void setBreadth(double breadthVal) {
		if(breadthVal < 0) {
			breadth = 0;
		} else {
			breadth = breadthVal;
		}
	}
	
	public double area() {
		return length * breadth;
	}
	
	public double perimeter() {
		return  2 * (length + breadth);
	}
	
	public boolean isSquare() {
		if(length == breadth) {
			return true;
		}
		return false;
	}
	
	public Rectangle2() {
		length = 1;
		breadth = 1;
	}
	
	public Rectangle2(double l, double b) {
		setLength(l);
		setBreadth(b);
	}
	
	public Rectangle2(double side) {
		length = breadth = side;
	}
}


public class ConstructorExample {

	public static void main(String[] args) {
		Rectangle2 r = new Rectangle2(-10, -5);
		System.out.println("Area = " + r.area());
		
	}
}