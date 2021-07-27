class SpeedConverter {
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0) return -1;
		double miph = kilometersPerHour / 1.609;
		long roundedmiph = Math.round(miph);
		return roundedmiph;
	}

	public static void printConversion(double kilometersPerHour) {
		long roundedmiph = toMilesPerHour(kilometersPerHour);
		if(roundedmiph > 0) {
			System.out.println(kilometersPerHour + " km/h = " + roundedmiph + " mi/h");
		} else {
			System.out.println("Invalid input");
		}
	}
}