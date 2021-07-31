class NumberOfDaysInAMonth {
	public static boolean isLeap(int year) {
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		} 	
	}

	
	public static int numOfDays(int month, int year) {
		boolean isitLeap;
		if((year < 1 || year > 9999) || (month < 1 || month > 12)) {
			return -1;
		} else {
			switch(month) {
				case 2 :{
						 isitLeap = isLeap(year);
						if(isitLeap) {
							return 29;
						} else {
							return 28;
						}
					}
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: return 31;
				default: return 30;
			}
		}
	}
}