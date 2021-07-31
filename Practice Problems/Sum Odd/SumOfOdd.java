class SumOfOdd {
	public static boolean isOdd(int num) {
		if(num % 2 != 0) return true;
		return false;
	}

	public static int sumOdd(int start, int end) {
		int sum = 0;
		if(start < 0 || end < 0) {
			return -1;
		} else {
			for(int i = start ; i <= end ; i++) {
				if(isOdd(i)) {
					sum += i;
				}
			}
		}
		return sum;
	}
}