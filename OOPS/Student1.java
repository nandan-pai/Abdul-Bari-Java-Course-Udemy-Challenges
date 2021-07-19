class Student {
	int roll;
	String name;
	String course;
	int m1, m2, m3;
	
	public String toString() {
		return "Student Name: " + name + " \nStudent Roll Number: " + roll + "\nCourse Name: " + course ;
	}
	
	public String displayStudentDetails() {
		return "Student Name: " + name + " \nStudent Roll Number: " + roll + "\nCourse Name: " + course ;
	}
	
	public int total() {
		return m1 + m2 + m3;
	}
	
	public double average() {
		return (double)(m1 + m2 + m3)/ 3;
	}
	
	public char grade() {
		int range = (int)average()/10;
		switch(range) {
		case 10: return 'O';
		case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		case 5: return 'E';
		default: return 'F';
		}
	}
	
}

public class Student1 {
	public static void main(String[] args) {
		Student st = new Student();
		st.name = "Nandan";
		st.roll = 21;
		st.course = "Computer Science";
		
		st.m1 = 99;
		st.m2 = 89;
		st.m3 = 79;
		//System.out.println("Student Details: \n" + st);
		System.out.println("Student Details: \n" + st.displayStudentDetails());
		System.out.println("Total marks = " + st.total());
		System.out.println("Average marks = " + st.average());
		System.out.println("Grade = " + st.grade());
	}

}
