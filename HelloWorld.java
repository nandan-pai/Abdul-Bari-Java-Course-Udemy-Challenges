import java.lang.*;
import java.util.*;

class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("Hello " + name + ". Welcome to Java Programming");
		System.out.println("Hope you'll survive the heat");
	}
}