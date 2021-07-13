public class StringExperiment {
	public static void main(String[] args) {
		char c[]  = {'A','B','C','D'};
		byte b[] = {65,66,67,68};
		String str1 = new String(c);
		String str2 = new String(b);
		//for str1 and str2 two objects are created one in heap and another one in pool because we used the keyword "new"
		//for str3 object is only in pool because it is simply a literal
		String str3 = "ABCD";
		String str4 = "ABCD";
		String str5 = new String(c);
		//str3 and str4 are pointing to same object multiple objects are not created to create new object "new" should be used
		
		System.out.println(str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5);
		System.out.println(str3 == str4);
		String randomstr = new String(c,1,3);
		System.out.println(randomstr);
	}
}
