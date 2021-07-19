class Circle2 {
	public double radius;
	
	public double area() { 
		return Math.PI * radius * radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double circumference() {
		return perimeter();
	}
}

class Cylinder3 extends Circle {
	public double height;
	
	public double volume() {
		return area() * height;
	}
}

public class Inheritancepractice {
	public static void main(String[] args) {
		Cylinder3 c = new Cylinder3();
		c.radius = 10;
		c.height = 5;
		System.out.println("Area: " + c.area() + " cm^2");
		System.out.println("Volume: " + c.volume() + " cm^3");
	}
}