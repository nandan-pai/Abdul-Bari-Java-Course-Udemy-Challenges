import java.util.Scanner;

public class AreaTriangleChallenge {

	public static void main(String[] args) {
		float base, height;
		System.out.println("_________Method 1__________");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter base and height of the triangle:(in cm ) ");
		base = in.nextFloat();
		height = in.nextFloat();
		float area = 0.5f * base * height;
		System.out.println("Area of triangle with base: " + base + "cm and height: " + height + "cm is = " + area + "cm^2");
	
	
		System.out.println("_________Method 2__________");
		System.out.println("Enter the value of three sides of trianlgle:(in cm) ");
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		in.close();
		float s = (a + b + c) / 2f;
		float areaWithSides =(float)Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("Area of triangle with a = " + a + "cm b = " + b + "cm c = " + c + "cm is " + areaWithSides + "cm^2");
	
	}

}
