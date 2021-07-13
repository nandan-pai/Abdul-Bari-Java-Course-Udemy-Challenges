public class StringMethods {

	public static void main(String[] args) {

		String str1 = "Java";
		String str2 = str1.toLowerCase();
		String str3 = str1.toUpperCase();
		String stringWithBlanks = "    Kishan     ";
		String randomOne = "Hello World";
		String partOfRandom = randomOne.substring(6,11);
		String partOfRandom2 = randomOne.substring(6);
		String replacedChar = randomOne.replace('o', ' ');
		
		System.out.println(str1.length());
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(stringWithBlanks);
		System.out.println(stringWithBlanks.trim());
		System.out.println(partOfRandom);
		System.out.println(partOfRandom2);
		System.out.println(replacedChar);
	}

}
