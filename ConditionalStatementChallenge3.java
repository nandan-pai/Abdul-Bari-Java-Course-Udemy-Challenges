import java.util.Scanner;

public class ConditionalStatementChallenge3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int dayNo = in.nextInt();

		if(dayNo == 1) {
			System.out.println("Monday");
		}
		else if(dayNo == 2) {
			System.out.println("Tuesday");
		}
		else if(dayNo == 3) {
			System.out.println("Wednesday");
		}
		else if(dayNo == 4) {
			System.out.println("Thursday");
		}
		else if(dayNo == 5) {
			System.out.println("Friday");
		}
		else if(dayNo == 6) {
			System.out.println("Saturday");
		}
		else if(dayNo == 7) {
			System.out.println("Sunday");
		}
		else {
			System.out.println("Invalid Day Number");
		}
		
		
		String url = in.next();
		in.close();
		
		/*if(url.startsWith("https")) {
			System.out.println("The URL has HyperText Tranfer Protocol Secured protocol");
		} else if(url.startsWith("http")) {
			System.out.println("The URL has HyperText Transfer Protocol");
		} else if(url.startsWith("ftp")) {
			System.out.println("The URL has File Transfer Protocol");
		} else {
			System.out.println("The URL follows sone protocol that I don't know or I don't remember or given URL is invalid");
		}
		
		System.out.println();
		
		if(url.endsWith(".com")) {
			System.out.println("The URl is of a commercial website");
		} else if(url.endsWith(".net")) {
			System.out.println("The URL is of a network");
		} else if(url.endsWith("org")) {
			System.out.println("The URl belongs to an organisation");
		}*/
		
		String protocol = url.substring(0, url.indexOf(":"));
		if(protocol.equals("https")) {
			System.out.println("The URL has HyperText Tranfer Protocol Secured protocol");
		} else if(protocol.equals("http")) {
			System.out.println("The URL has HyperText Transfer Protocol");
		} else if(protocol.equals("ftp")) {
			System.out.println("The URL has File Transfer Protocol");
		} else {
			System.out.println("The URL follows sone protocol that I don't know or I don't remember or given URL is invalid");
		}
		
		String extension = url.substring(url.lastIndexOf(".") + 1);
		
		if(extension.equals("com")) {
			System.out.println("The URl is of a commercial website");
		} else if(extension.equals("net")) {
			System.out.println("The URL is of a network");
		} else if(extension.equals("org")) {
			System.out.println("The URl belongs to an organisation");
		} else {
			System.out.println("Some extension I don't acknowledge or it is invalid");
		}
	}

}
