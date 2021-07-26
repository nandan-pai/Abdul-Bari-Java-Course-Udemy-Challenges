class Phone {
	public void call() {
		System.out.println("Making a call");
	}
	
	public void sms() {
		System.out.println("Seding a message");
	}
}


interface Camera {
	void clickPhoto();
	void takeVideo();
}

interface MusicPlayer {
	void playMusic();
	void makeAPlaylist();
}

class Smartphone extends Phone implements Camera, MusicPlayer {
	@Override
	public void clickPhoto() {
		System.out.println("Taking a picture");
	}

	@Override
	public void takeVideo() {
		System.out.println("Recording a video");
	}
	
	@Override
	public void playMusic() {
		System.out.println("Playing music");
	}

	@Override
	public void makeAPlaylist() {
		System.out.println("Creating a new playlist");
	}
	
	public void makeVideoCall() {
		System.out.println("Making a video call");
	}
}

public class InterfaceSmartphoneExample {
	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		Camera c = s;
		MusicPlayer m = s;
		s.call();
		s.sms();
		s.clickPhoto();
		s.takeVideo();
		s.playMusic();
		s.makeAPlaylist();
		s.makeVideoCall();
		
		System.out.println();
		
		c.clickPhoto();
		c.takeVideo();
		
		System.out.println();
		
		m.playMusic();
		m.makeAPlaylist();
	}
}