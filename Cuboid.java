import java.util.Scanner;

public class Cuboid {

	public static void main(String[] args) {
		System.out.println("Enter length, breadth and height of cuboid: ");
		Scanner in = new Scanner(System.in);
		double length = in.nextDouble();
		double breadth = in.nextDouble();
		double height = in.nextDouble();
		in.close();
		double area = 2*(length * height + breadth * height + length * breadth);
		double volume = length * breadth * height;
		System.out.println("For given cuboid with length = " + length + " cm, breadth = " + breadth + " cm and height = " + height + " cm. The area and volume is,");
		System.out.println("Area: " + area + " cm^2");
		System.out.println("Volume: " + volume + " cm^3");
	}

}
