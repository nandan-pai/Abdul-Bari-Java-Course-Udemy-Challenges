class FlourPack {
	public static boolean canPack(int big, int small, int goal) {
		if(big < 0 || small < 0 || goal < 0) return false;
		
		//big =>5kg small=>1kg
		//can't overflow, but underflow is possible
		//can't cut 5kg pack
		
		if(big * 5 <= goal) {
			return true;
		}
		return false;
	}
} 