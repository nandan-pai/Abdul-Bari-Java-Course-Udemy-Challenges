import java.util.Scanner;

public class ConditionslStatementChallenge {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
		System.out.println("Enter your age: ");
		int age = in.nextInt();		
		if(age < 18) {
			System.out.println("Young");
		}
		else {
			System.out.println("Old");
		}
		
		System.out.println("Enter total marks: ");
		int marks = in.nextInt();
		
		in.close();
		char grade;
		if(marks < 40) {
			grade = 'F';
		}
		else if(marks  >=  40 && marks < 50) {
			grade = 'E';
		}
		else if(marks >= 50 & marks < 60) {
			grade = 'D';
		}
		else if(marks >= 60 && marks < 70) {
			grade = 'C';
		}
		else if(marks >= 70 && marks < 80) {
			grade = 'B';
		}
		else if(marks >= 80 && marks < 90) {
			grade = 'A';
		}
		else {
			grade = 'O';
		}
		System.out.println("For Marks : " + marks + "  Grade is : " + grade);
	}

}
