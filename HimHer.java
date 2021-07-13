import java.util.*;

public class HimHer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		in.close();
		int distinctChars = 1;
		char[] allchars = name.toCharArray();
		Arrays.sort(allchars);
		for(int i = 1 ; i < allchars.length ; i++) {
			if(allchars[i-1] != allchars[i]) {
				distinctChars += 1;
			}
		}		
		if(distinctChars % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
	}

}
