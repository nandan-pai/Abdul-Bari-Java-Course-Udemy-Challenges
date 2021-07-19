class RectangleClass {
	private double length, breadth;
	
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
}

public class DataHidiingRectangle {
	public static void main(String[] args) {
		RectangleClass rect1 = new RectangleClass();
		rect1.setLength(10);
		rect1.setBreadth(5);
		System.out.println("For rectangle with length = " + rect1.getLength() + " and breadth = " + rect1.getBreadth() + " : ");
		System.out.println("Area = " + rect1.area() + " cm^2");
		System.out.println("Perimeter = " + rect1.perimeter() + " cm");
		System.out.println("Is given rectangle a square? " + rect1.isSquare());
	}
}