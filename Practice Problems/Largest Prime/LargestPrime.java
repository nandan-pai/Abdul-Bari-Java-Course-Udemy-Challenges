class LargestPrime {
	public static boolean isPrime(int num) {
		for(int i = 2 ; i < num / 2; i++) {
			if(num % i == 0)return false;
		}
		return true;
	}
	
	public static int getLargestPrime(int num) {
		if(num < 2) return -1;
		if(num == 2 || num % 2 == 0) return 2;
		if(isPrime(num))return num;

		int largest = 1;
		for(int i = 3 ; i < num / 2 ; i = i + 2) {
			if(isPrime(i) && num % i == 0) {
				largest = i;
			}
		} 
		return largest;
	}
}