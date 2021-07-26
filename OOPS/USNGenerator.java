import java.util.Date;

class StudentUSN {
	private static int count = 1;
	private String usn;
	
	private String generateUSN() {
		Date d = new Date();
		@SuppressWarnings("deprecation")
		String roll = "UNIV-" + (d.getYear() + 1900) + "-" + count;
		count++;
		return roll;
	}
	
	public StudentUSN() {
		usn = generateUSN();
	}
	
	public String getUSN() {
		return usn;
	}
}

public class USNGenerator {
	public static void main(String[] args) {
		StudentUSN s1 = new StudentUSN();
		StudentUSN s2 = new StudentUSN();
		StudentUSN s3 = new StudentUSN();
		StudentUSN s4 = new StudentUSN();

		
		System.out.println(s1.getUSN());
		System.out.println(s2.getUSN());
		System.out.println(s3.getUSN());
		System.out.println(s4.getUSN());
	}
}