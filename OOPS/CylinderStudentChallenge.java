class Cylinder2 {
	private double radius, height;
	
	public double getRadius() {
		return radius;
	}
	
	public double getheight() {
		return height;
	}
	
	public void setRadius(double r) {
		if(radius < 0) {
			radius = 1;
		} else {
			radius = r;
		}
	}
	
	public void setHeight(double h) {
		if(height < 0) {
			height = 1;
		} else {
			height = h;
		}
	}
	
	public Cylinder2() {
		radius = 0;
		height = 0;
	}
	
	public Cylinder2(double r) {
		radius = r;
	}
	
	public Cylinder2(double r, double h) {
		radius = r;
		height = h;
	}
	
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

public class CylinderStudentChallenge {
	public static void main(String[] args) {
		Cylinder2 c = new Cylinder2(10);
		c.setHeight(10);
		c.setRadius(5);
		System.out.println("For height = " + c.getheight() + " cm and radius = " + c.getRadius() + " cm : ");
		System.out.format("Lid Area = %.2f cm^2\n", c.lidArea());
		System.out.format("Total surface area = %.2f cm^2\n", c.totalSurfaceArea());
		System.out.format("Volume = %.2f cm^3\n", c.volume());	
	}
}