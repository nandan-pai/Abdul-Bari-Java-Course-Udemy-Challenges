public class StringOperationsChallange {

	public static void main(String[] args) {
			String str = "progammer@gmail.com";
			int uNameEnd = str.indexOf('@');
			String userName = str.substring(0,uNameEnd);
			String domainName = str.substring(uNameEnd);
			System.out.println("Username is : " + userName);
			if(domainName.equals("@gmail.com")) {
				System.out.println("Yes, domain name is gmail.com");
			} else {
				System.out.println("No, domain name is not gmail.com but it is : " + domainName);
			}
	}

}
