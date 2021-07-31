class LastDigitChecker {
	public static boolean hasSameLastDigit(int a, int b, int c) {
		if(a < 10 || a > 1000 || b < 10 || b > 1000 || c < 10 || c > 1000) return false;
		if(a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10)return true;
		return false;
	}
}