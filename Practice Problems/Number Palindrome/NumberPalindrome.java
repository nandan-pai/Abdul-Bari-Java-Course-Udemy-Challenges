class NumberPalindrome {
	public static boolean isPalindrome(int sentNum) {
		int num = Math.abs(sentNum);
		int n = num;
		int rev = 0;
		while(n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		if(rev == num) return true;
		return false;
	}
}