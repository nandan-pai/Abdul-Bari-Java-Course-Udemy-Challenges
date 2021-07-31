class NumToWords {
	public static int getDigitCount(int num) {
		return Integer.toString(num).length();
	}

	public static void printInWords(int num, int digits) {
		String numstr = Integer.toString(num);
		while(digits > 0) {
			for(int i = 0 ; i < numstr.length() ; i++) {				
				switch(numstr.charAt(i)) {
					case '0': System.out.print("Zero ");break;
					case '1': System.out.print("One ");break;
					case '2': System.out.print("Two ");break;
					case '3': System.out.print("Three ");break;
					case '4': System.out.print("Four ");break;
					case '5': System.out.print("Five ");break;
					case '6': System.out.print("Six ");break;
					case '7': System.out.print("Seven ");break;
					case '8': System.out.print("Eight ");break;
					case '9': System.out.print("Nine ");break;
				}
				digits--;
			}
			for(int i = 0 ; i < digits - numstr.length() ; i++) {
				System.out.print("Zero ");
			}
		} 
	}
	
	public static void numberToWords(int num) {
		if(num < 0) {
			System.out.println("Invalid Value");
		} else {
			int digits = getDigitCount(num);
			printInWords(num, digits);
		}
	}
}