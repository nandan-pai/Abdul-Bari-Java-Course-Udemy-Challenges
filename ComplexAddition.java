import java.util.Scanner;

class Complex {
	 int real, imaginary;
}

public class ComplexAddition {
	
	static int input() {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		//in.close();
		return num;
	}
	
	static Complex addTwoComplex(Complex comp1, Complex comp2) {
		Complex comp3 = new Complex();
		comp3.real = comp1.real + comp2.real;
		comp3.imaginary = comp1.imaginary + comp2.imaginary;
		return comp3;
	}
	
	static void display(Complex comp1, Complex comp2, Complex comp3) {
		System.out.format("%d + %di  + %d + %di = %d + %di",comp1.real, comp1.imaginary, comp2.real, comp2.imaginary, comp3.real, comp3.imaginary);
	}
	
	public static void main(String[] args) {
		Complex comp1 = new Complex();
		Complex comp2 = new Complex();
		
		System.out.println("Enter real and imaginary co-efficients for first complex number: ");
		comp1.real = input();
		comp1.imaginary = input();
		
		System.out.println("Enter real and imaginary co-efficients for second complex number: ");
		comp2.real = input();
		comp2.imaginary = input();
		
		Complex comp3 = new Complex();
		comp3 = addTwoComplex(comp1, comp2);
		
		display(comp1, comp2, comp3);
	}
}