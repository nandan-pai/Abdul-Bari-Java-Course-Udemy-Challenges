class Subject {
	String subId;
	String subName;
	int maxMarks;
	int mObtained;
	
	public Subject(String subId, String subName) {
		this.subId = subId;
		this.subName = subName;
	}
	
	public Subject(String subId, String subName, int maxMarks, int mObtained) {
		this.subId = subId;
		this.subName = subName;
		this.maxMarks = maxMarks;
		this.mObtained = mObtained;
	}
	
	public Subject(String subId, String subName, int maxMarks) {
		this.subId = subId;
		this.subName = subName;
		this.maxMarks = maxMarks;
	}
	
	public String getSubid() {
		return subId;
	}
	
	public String getSubname() {
		return subName;
	}
	
	public int getmaxMarks() {
		return maxMarks;
	}
	
	public int getMObtained() {
		return mObtained;
	}
	
	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}
	
	public void setmarksObtained(int mObtained) {
		this.mObtained = mObtained;
	}
	
	public boolean isQualified() {
		return mObtained >= maxMarks / 10 * 4;
	}
	
	public String toString() {
		return "\nSubject ID: " + subId + "\nSubject Name: " + subName + "\nMarks Obtained: " + mObtained;
	}
}

class Studentcls {
	int rollno;
	String studName;
	String dept;
	Subject sub[] = new Subject[6];
	
	Studentcls(int rollno, String studName, String dept, Subject sub[]) {
		this.rollno = rollno;
		this.studName = studName;
		this.dept = dept;
		for(int i = 0 ; i < sub.length ; i++) {
			this.sub[i] = sub[i];
		}
	}
	
	public int getroll() {
		return rollno;
	}
	
	public String getstudName() {
		return studName;
	}
	
	public String getdept() {
		return dept;
	}
	
	public Subject[] getsubjects() {
		return sub;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setSubjects(Subject ...x) {
		for(int i = 0 ; i < x.length ; i++) {
			sub[i] = x[i];
		}
	}
	
}

public class ArrayOfObjects {
	public static void main(String[] args) {
		Subject subs[] = new Subject[3];
		subs[0] = new Subject("s101", "DS", 100);
		subs[1] = new Subject("s102", "ADA", 100);
		subs[2] = new Subject("s103", "OS", 100);
		
		
		
		for(Subject s: subs) {
			System.out.println(s);
		}
	}
}