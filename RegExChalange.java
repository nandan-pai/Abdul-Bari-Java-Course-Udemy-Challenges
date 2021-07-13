import java.util.Scanner;

public class RegExChalange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a binary number: ");
		int binaryNum = input.nextInt();
		String binaryStr = String.valueOf(binaryNum);
		System.out.println(binaryStr.matches("[01]+"));
		
		System.out.println("Enter a hexadecimal number: ");
		String hexaDecimalNum = input.next();
		System.out.println(hexaDecimalNum.matches("[0-9A-F]+"));
		
		System.out.println("Enter date in the format dd/mm/yyyy");
		String dateString = input.next();
		System.out.println(dateString.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));		
		
		input.close();			
	}

}
