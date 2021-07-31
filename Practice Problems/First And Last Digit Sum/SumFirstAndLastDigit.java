class SumFirstAndLastDigit {
	public static int sumFirstAndLastDigit(int num) {
		if(num < 0) return -1;
		else {
			String numstr = Integer.toString(num);
			int first = Character.getNumericValue(numstr.charAt(0));
			int last = Character.getNumericValue(numstr.charAt(numstr.length() - 1));
			return first + last;
		}
	}
}	