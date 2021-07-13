public class RegularExpressions {

	public static void main(String[] args) {
		String str1 = "abcd";
		
		/*
		 Regular Expression 	Description
		 --------------------------------------------------
		 .						Any character
		 [abc]					Exactly given letters
		 [abc][vz]				Either first or second set
		 [^abc]					Except abc
		 [a-z1-7]				a-z or 1-7
		 A|B 					A or B
		 XZ 					Exactly XZ
		 */		 
 		System.out.println(str1.matches("abc"));

		/* 
	     ~~~~~~~~~~~~~~~~~ META CHARACTERS~~~~~~~~~~~~~~~~~~~~~
 		 Regular Expression		Description
 		 ------------------------------------------------------
 		 \d						Digits
 		 \D						Not digits	
 		 \s						Space
 		 \S						Not Space
 		 \w						Alphabets or digit
 		 \W						Neither Alphabet or digit
		 */
 		String str2 = " ";
 		System.out.println(str2.matches("\\W"));
 		
 		
 		/*
 		 ~~~~~~~~~~~~~~~~~~~Quantifiers~~~~~~~~~~~~~~~~~~~~~~~~~~
 		 Regular Expression 		Description
 		 --------------------------------------------------------
 		 *							0 or more times
 		 +							One or more 
 		 ?							0 or 1 time
 		 {X}						X times
 		 {X,Y}						Between X and Y time
 		 */
 		
 		String str3 = "acbbac";
 		System.out.println(str3.matches("[acb]{3,7}"));
		
 		
 		//isGmail checker
 		String str4 = "nandanpai2k1@gmail.com";
 		System.out.println(str4.matches("\\w*@gmail.com"));
	}

}
