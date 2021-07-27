class DogWakesMeUp {
	public static boolean shouldWakeUp(boolean barking, int hoursOfDay) {
		if(barking) {
			if(hoursOfDay < 0 || hoursOfDay > 23) {
				return false;
			} else if(hoursOfDay >= 22 || hoursOfDay < 8){
				return true;
			}
		}
		return false;
	}
}