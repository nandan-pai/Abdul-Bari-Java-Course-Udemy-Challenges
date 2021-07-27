import java.util.*;

class Main {
	public static void main(String args[]) {
		System.out.println("Enter size in KiloBytes(KB): ");
		Scanner input = new Scanner(System.in);	
		int kiloBytes = input.nextInt();
		input.close();
		MegaBytesKiloBytes.printMegaBytesAndKiloBytes(kiloBytes);
	}
}