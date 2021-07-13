public class BitwiseDemo {

	public static void main(String[] args) {
		int x = -0b1010;
		int z;
		z = x>>>1;
		System.out.println(String.format("%s", Integer.toBinaryString(x)));

		System.out.println(String.format("%32s", Integer.toBinaryString(z)));
	}

}
