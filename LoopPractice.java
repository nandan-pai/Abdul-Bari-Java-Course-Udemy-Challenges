public class LoopPractice {

	public static void main(String[] args) {
		int i = 1;
		while(i < 100) {
			System.out.println(i);
			i *= 2;
		}
		
		int j = 1;
		do {
			System.out.println(j);
			j *= 2;
		} while(j < 100);
		
		
		//Infinite Loop
		short k = 1;
		while(true) {
			System.out.println(k);
			k++;
		}
	}

}
