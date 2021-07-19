class Rectangle {
	double length, breadth;
	
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
}

public class Rectangle1 {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		rect1.length = 2;
		rect1.breadth = 2;
		System.out.println("For rectangle with length = " + rect1.length + " and breadth = " + rect1.breadth + " : ");
		System.out.println("Area = " + rect1.area() + " cm^2");
		System.out.println("Perimeter = " + rect1.perimeter() + " cm");
		System.out.println("Is given rectangle a square? " + rect1.isSquare());
	}
}