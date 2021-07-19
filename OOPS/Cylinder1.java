class Cylinder {
	double radius, height;
	
	public double lidArea() {
		return Math.PI * radius * radius;
	}
	
	public double Circumference() {
		return 2 * Math.PI * radius;
	}
	
	public double totalSurfaceArea() {
		return 2 * lidArea() + Circumference() * height;
	}
	
	public double volume() {
		return lidArea() * height;
	}
}

public class Cylinder1 {

	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		
		c.radius = 7;
		c.height = 10;
		
		System.out.format("Lid Area = %.2f\n", c.lidArea());
		System.out.format("Total surface area = %.2f\n", c.totalSurfaceArea());
		System.out.format("Volume = %.2f\n", c.volume());
	}

}
