class NPrimes {
	public static void printNPrimes(int primesTill) {
		for(int i = 2 ; i <= primesTill ; i++) {
			if(IsPrime.isPrime(i)) {
				System.out.print(i + " "); 
			}
		} 
	}
}