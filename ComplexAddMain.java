import java.util.Scanner;

public class ComplexAddMain {

	static double input() {
		Scanner in = new Scanner(System.in);
		double num = in.nextDouble();
		//in.close();
		return num;
	}
	
	static void display(Complex comp1, Complex comp2, Complex comp3) {
		System.out.format("%.2f + %.2fi  + %.2f + %.2fi = %.2f + %.2fi",comp1.real, comp1.imaginary, comp2.real, comp2.imaginary, comp3.real, comp3.imaginary);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter real and imaginary co-efficients for first complex number: ");
		double comp1real = input();
		double comp1imaginary = input();
		Complex comp1 = new Complex(comp1real, comp1imaginary);
		
		System.out.println("Enter real and imaginary co-efficients for second complex number: ");
		double comp2real = input();
		double comp2imaginary = input();
		Complex comp2 = new Complex(comp2real, comp2imaginary);

		Complex comp3 = Complex.add(comp1,comp2);
		
		display(comp1, comp2, comp3);
	}
}