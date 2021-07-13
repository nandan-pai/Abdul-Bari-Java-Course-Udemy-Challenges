import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		/*String str = new String("NetBeans");
		String str2 = str.substring(3,5);
		String str3 = str.replace('e','o');
		
		System.out.println(str.length());
		System.out.println(str2);
		System.out.println(str3);
		
		//Startswith and endswith
		String strInfi = "Kishan";
		String anyThing = "Hakunana Matata";
		System.out.println(strInfi.startsWith("Ki"));
		System.out.println(strInfi.endsWith("shan")); 
		System.out.println(strInfi.charAt(3));
		System.out.println(anyThing.indexOf('a',7));
		System.out.println(anyThing.lastIndexOf('a'));
		
		*/
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name with Mr. , Ms. or Mrs. as prefix.");
		String name = in.nextLine();
		in.close();
		if(name.startsWith("Mr.")) {
			System.out.println("Hello " + name + ". You are very handsome ");
		} else if(name.startsWith("Ms.") || name.startsWith("Mrs.")){
			System.out.println("Hello " + name + ". You are very gorgeous.");
		} else {
			System.out.println("Hello " + name + ". You are a beautiful human.");
		}
		
		String str1 = "Java";
		String str2 = "java";
		String str3 = "Pyhon";
		System.out.println(str1.substring(1).equals(str2.substring(1)));
		
		System.out.println(str1.compareTo(str3));
		
		String str4 = "java";
		String str5 = new String("java");
		System.out.println(str2 == str4);
		
		//Compare references
		System.out.print("str4 and str5 are having same reference :");
		System.out.println(str4 == str5);
		
		//Compare strings
		System.out.println("str4 and str5 have same string content :" + str4.equals(str5));
	
		String strRandom = "Typing anything completely random I have no idea what am I typing";
		System.out.println("strRandom contains search word \"completely\" : " + strRandom.contains("completely"));
	}
}