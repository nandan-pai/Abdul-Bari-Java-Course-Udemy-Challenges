class PrintFactors {
	public static void printFactors(int num) {
		if(num < 1) {
			System.out.println("Invalid Value");
		} else {
			for(int i = 1 ; i <= num / 2 ; i++) {
				if(num % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println(num);
		}
	}
}