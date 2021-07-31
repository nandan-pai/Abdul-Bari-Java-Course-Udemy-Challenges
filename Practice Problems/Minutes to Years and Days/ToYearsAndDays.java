class ToYearsAndDays {
	public static void printYearsAndDays(int minutes) {
		if(minutes < 0 ){
			System.out.println("Invalid input");
		} else {
			int hours = minutes / 60;
			int days = hours / 24;
			int years = days / 365;
			days = days % 365;
			System.out.println(minutes + "minutes = " + years + " years " + days + " days.");
		}
	}
}