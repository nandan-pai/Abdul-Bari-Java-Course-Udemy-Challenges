public class Complex {
	double real, imaginary;
	
	Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public static Complex add(Complex comp1, Complex comp2) {
		Complex comp3 = new Complex(0.0, 0.0);
		comp3.real = comp1.real + comp2.real;
		comp3.imaginary = comp1.imaginary + comp2.imaginary;
		return comp3;
	}
}
