class DecimalComparator {
	public static boolean areEqualByThree(double a, double b) {
		if(Math.abs(a - b) < 1e-3) {
			return true;
		}
		return false;
	}
}