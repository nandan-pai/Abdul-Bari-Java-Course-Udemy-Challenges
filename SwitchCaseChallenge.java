import java.util.Scanner;

public class SwitchCaseChallenge {

	public static void main(String[] args) {
		System.out.print("Enter day number: ");
		Scanner in = new Scanner(System.in);
		int dayNo = in.nextInt();
		
		System.out.print("Enter month number: ");
		int monthNo = in.nextInt();
		
		System.out.print("Enter URL: ");
		String url = in.next();
		String protocol = url.substring(0, url.indexOf(':'));
		String extension = url.substring(url.lastIndexOf('.') + 1);
		in.close();
		
		
		switch(dayNo) {
		case 1: System.out.println("Monday");
				break;
		case 2: System.out.println("Tuesday");
				break;
		case 3: System.out.println("Wednesday");
				break;
		case 4: System.out.println("Thursday");
				break;
		case 5: System.out.println("Friday");
				break;
		case 6: System.out.println("Saturday");
				break;
		case 7: System.out.println("Sunday");
				break;
		default: System.out.println("Invalid Day Number");
		
		}
		
		System.out.println();
		
		switch(monthNo) {
		case 1: System.out.println("January");
				break;
		case 2 : System.out.println("February");
				break;
		case 3: System.out.println("March");
				break;
		case 4: System.out.println("April");
				break;
		case 5: System.out.println("May");
				break;
		case 6: System.out.println("June");
				break;
		case 7: System.out.println("July");
				break;
		case 8: System.out.println("August");
				break;
		case 9: System.out.println("September");
				break;
		case 10: System.out.println("October");
				break;
		case 11: System.out.println("November");
				break;
		case 12: System.out.println("December");
				break;
		default: System.out.println("Invalid month number");
		}
		
		
		switch(protocol) {
		case "https": System.out.println("HyperText Transfer Protocol Secured");
						break;
		case "http": System.out.println("HyperText Transfer Protocol");
						break;
		case "ftp": System.out.println("File Transfer Protocol");
						break;
		default: System.out.println("Some procol may be valid or invalid");
		}
		
		switch(extension) {
		case "com": System.out.println("Commercial Website");
					break;
		case "org": System.out.println("Organisation's website");
					break;
		case "net": System.out.println("Network website");
					break;
		default: System.out.println("Some extention may be valid or invalid");
		}
	}

}
