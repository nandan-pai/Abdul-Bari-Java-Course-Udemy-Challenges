import java.util.Scanner;

public class MethodOverloadChallenge3 {

    static boolean validate(int age) {
        int agelimit = 15;
        if(age > agelimit) {
            return false;
        }
        return true;
    }

    static boolean validate(String name) {
        name = name.strip();
        if(name.isEmpty()) {
            return false;
        }
        for(int i = 0 ; i < name.length() ; i++) {
            if(!((name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || name.charAt(i) == ' ')) {
                return false;
            }
        }
        return true;
    }

    static int ageinput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = in.nextInt();
        //in.close();
        return age;
    }

    static String nameinput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = in.nextLine();
        in.close();
        return name;
    }

    static void display(int age, String name, boolean isValidAge, boolean isValidName) {
        if(isValidAge) {
            System.out.println(age + " is valid age");
        } else {
            System.out.println("Invalid age");
        }

        if(isValidName) {
            System.out.println(name + " is valid name.");
        } else {
            System.out.println(name + " is invalid name");
        }
    }

    public static void main(String[] args) {
        int age = ageinput();
        String name = nameinput();
        boolean isValidAge = validate(age);
        boolean isValidName = validate(name);

        display(age, name ,isValidAge, isValidName);
    }

}
