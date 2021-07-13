import java.util.Scanner;

public class ForLoopChallenge4 {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			in.close();
		
			int revCpy = num;
			String revstr = "";
			int rem = 0;
			while(revCpy != 0) {
				rem = revCpy % 10;
				revstr += rem;
				revCpy /= 10;
			}				
			
			 for(int i = revstr.length() - 1 ; i >= 0 ; i--) {
				 char character = revstr.charAt(i); 
				 switch(character) {
				 	case '0': System.out.print("Zero ");
				 			break;
					case '1': System.out.print("One ");
							break;
					case '2': System.out.print("Two ");
							break;
					case '3': System.out.print("Three ");
							break;
					case '4': System.out.print("Four ");
							break;
					case '5': System.out.print("Five ");
							break;
					case '6': System.out.print("Six ");
							break;
					case '7': System.out.print("Seven ");
							break;
					case '8': System.out.print("Eight ");
							break;
					case '9': System.out.print("Nine ");
							break;
					default: System.out.println(" ");
				}
			 }
		}
}