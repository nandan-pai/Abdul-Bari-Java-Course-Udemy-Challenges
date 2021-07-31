class IsCatPlaying {
	public static boolean isCatPlaying(boolean isSummer, int temperature) {
		if(isSummer) {
			if(temperature >= 25 & temperature <= 45) return true;
		} else {
			if(temperature >= 25 & temperature <= 35) return true;
		} return false;
	}
}	