import java.util.Scanner;

public class SwichCaseChallenge2 {

	public static void main(String[] args) {
		System.out.printf("Arithmetic Operations: \n 1.ADD \n 2.SUB \n 3.MUL \n 4.DIV \n");
		System.out.print("Enter choice to conduct operation: ");
		Scanner in = new Scanner(System.in);
		int choice = in.nextInt();
	
		int n1, n2;
		switch(choice) {
		case 1: System.out.println("Enter value1 and value2: ");
				n1 = in.nextInt();
				n2 = in.nextInt();
				System.out.println(n1 + " + "+ n2 + " = "  + (n1 + n2));
				break;
		case 2: System.out.println("Enter value1 and value2: ");
				n1 = in.nextInt();
				n2 = in.nextInt();
				System.out.println(n1 + " - "+ n2 + " = "  + (n1 - n2));
				break;
		
		case 3: System.out.println("Enter value1 and value2: ");
				n1 = in.nextInt();
				n2 = in.nextInt();
				System.out.println(n1 + " * "+ n2 + " = "  + (n1 * n2));
				break;
		
		case 4: System.out.println("Enter value1 and value2: ");
				n1 = in.nextInt();
				n2 = in.nextInt();
				System.out.println(n1 + " / "+ n2 + " = "  + (n1 / n2));
				break;
		
		default: System.out.println("Invalid Choice");	
		}
		in.close();
	}

}
