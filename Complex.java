public class Complex {
	double real, imaginary;
	
	Complex(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	
	//Wrong
	/*public static Complex add(Complex comp1, Complex comp2) {
		Complex comp3 = new Complex(0.0, 0.0);
		comp3.real = comp1.real + comp2.real;
		comp3.imaginary = comp1.imaginary + comp2.imaginary;
		return comp3;
	}*/
	
	/*public Complex add(Complex comp) {
		Complex compresult = new Complex(0.0, 0.0);
		compresult.real = this.real + comp.real;
		compresult.imaginary = this.imaginary + comp.imaginary;
		return compresult;
	}*/
	
	public Complex add(Complex comp) {
		return new Complex(real+comp.real, imaginary+comp.imaginary);
	}
}
