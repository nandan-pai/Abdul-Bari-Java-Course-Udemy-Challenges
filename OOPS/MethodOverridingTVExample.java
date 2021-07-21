class TV {
	public void switchON() {
		System.out.println("TV is switched on");
	}
	
	public void changeChannel() {
		System.out.println("TV channel is changed");
	}
}

class SmartTV extends TV {
	public void switchON() {
		System.out.println("Smart TV is switched on");
	}
	
	public void changeChannel() {
		System.out.println("Smart TV channel is changed");
	}
	
	public void playSpotifyMusic() {
		System.out.println("Smart TV playing music on Spotify");
	}
}


public class MethodOverridingTVExample {
	public static void main(String[] args) {
		//Note that reference of child class cannot hold parent class object
		// SmartTV is TV but TV is not SmartTV
		TV tv = new SmartTV();
		tv.switchON();
		tv.changeChannel();
		
		/*SmartTV stv = new SmartTV();
		stv.switchON();
		stv.changeChannel();
		stv.playSpotifyMusic();*/
	}
}