class EvenDigitSum {
	public static int getEvenDigitSum(int num) {
		if(num < 0) return -1;
		int sum = 0;
		while(num > 0) {
			int rem = num % 10;		

			if(rem % 2 == 0)sum += rem;

			num /= 10;
		} 
		return sum;
	}
}