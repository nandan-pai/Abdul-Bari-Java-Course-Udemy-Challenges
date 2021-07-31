class SharedDigit {
	public static boolean hasSharedDigit(int a, int b) {
		if(a < 10 || a > 99 || b < 10 || b > 99) return false;
		String astr = Integer.toString(a);
		String bstr = Integer.toString(b);
		for(int i = 0 ; i < bstr.length() ; i++) {
			for(int j = 0 ; j < astr.length() ; j++) {
				if(bstr.charAt(i) == astr.charAt(j)) {
					return true;
				}
			} 
		}
		return false;
	}
}