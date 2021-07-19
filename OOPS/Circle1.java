class Circle {
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

public class Circle1 {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.radius = 10;
		System.out.println("For radius = " + c1.radius);
		System.out.println("Area = " + c1.area());
		System.out.println("Perimeter = " + c1.perimeter());
		System.out.println("Circumference = " + c1.circumference());
		
		
		System.out.println();
		Circle c2 = new Circle();
		c2.radius = 5;
		System.out.println("For radius = " + c2.radius);
		System.out.println("Area = " + c2.area());
		System.out.println("Perimeter = " + c2.perimeter());
		System.out.println("Circumference = " + c2.circumference());
	}

}
