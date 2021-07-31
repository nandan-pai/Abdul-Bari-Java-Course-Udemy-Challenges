import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.printf("Enter choice to find it's area: \n1.Circle \n2.Rectangle\n");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		double ar;
		if(choice == 1) {
			System.out.println("Enter radius: ");
			double radius = input.nextDouble();
			ar = Area.area(radius);
			if(ar == -1) {
				System.out.println("Invalid radius value");
			} else {
				System.out.println("Area of circle = " + ar);
			}
		} else if(choice == 2) {
			System.out.println("Enter length and breadth: ");
			double length = input.nextDouble();
			double breadth = input.nextDouble();
			ar = Area.area(length, breadth);
			if(ar == -1) {
				System.out.println("Invalid dimension value");
			} else {
				System.out.println("Area of rectangle = " + ar);
			}
		} else {
			System.out.println("Invalid Input");
		}
		input.close();
	}
}