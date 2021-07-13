import java.util.*;

public class RegExChallenge2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string which contain special characters : "); 
		String str = in.nextLine();
		String newStr = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("Original String is : "+ str);
		System.out.println("New String without special characters is : "+ newStr);
		
		System.out.println("Enter a string: ");
		String strSpace = in.nextLine();
		String strNoSpace = strSpace.replaceAll("\\s+", " ").trim();
		System.out.println("String after removing extra spaces is: " + strNoSpace);
		
		System.out.println("Enter a string to count number of words in it : ");
		String strWithWords = in.nextLine();
		String strCopy = strWithWords.replaceAll("\\s+", " ").trim();
		String words[] = strCopy.split("\\s");		
		System.out.println("Number of words in given string is : " + words.length);
		
		in.close();
	}

}
