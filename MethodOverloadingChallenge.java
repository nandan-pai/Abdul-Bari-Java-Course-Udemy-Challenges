import java.util.Scanner;

public class MethodOverloadingChallenge {

	static float area(float length, float breadth) {
		return length * breadth;
	}
	
	static float area(float radius) {
		return (float)Math.PI * radius * radius;
	}
	
	
	static float valInput() {
		Scanner in = new Scanner(System.in);
		float val = in.nextFloat();
		//in.close();
		return val;
	}
	
	static void display(boolean calculated, int choice, float length, float breadth, float radius, float ar) {
		if(calculated) {
			if(choice == 1) {
				System.out.format("Area of the rectangle with length : %.2f cm. breadth: %.2f cm. is: %.2f sq.cm", length, breadth, ar);
				//System.out.println("Area of the rectangle with length : " + length + "cm. breadth: " + breadth + "cm. is: " + ar + " sq.cm");
			} else {
				System.out.format("Area of circle with radius: %.2f cm. is %.2f sq.cm", radius, ar);
				//System.out.println("Area of circle with radius: " + radius + " cm. is = " + ar + "sq.cm");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter choice to calculate area : \n 1.Rectangle  \n 2.Circle");
		int choice = in.nextInt();
		boolean calculated = false;
		float length = 0, breadth = 0, radius = 0, ar = 0;
		if(choice == 1) {
			System.out.println("Enter length and breadth (in cm): ");
			length = valInput();
			breadth = valInput();
			ar = area(length, breadth);
			calculated = true;
		} else if(choice == 2) {
			System.out.println("Enter radius (in cm): ");
			radius = valInput();
			ar = area(radius);
			calculated = true;
		} else {
			System.out.println("Invalid Choice");
		}
		in.close();
		display(calculated, choice, length, breadth, radius, ar);	
	}
}