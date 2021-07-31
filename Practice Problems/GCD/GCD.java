class GCD {
	public static int getgreatestCommonDivisor(int a, int b) {
		if(a < 10 || b < 10) return -1;
		int gcd = 1;
		for(int i = 2; i <= a && i <= b; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}