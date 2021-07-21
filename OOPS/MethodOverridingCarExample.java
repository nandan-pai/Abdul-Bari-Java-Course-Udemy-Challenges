class Car {
	public void startCar() {
		System.out.println("Car is started");
	}
	
	public void accelerate() {
		System.out.println("Car is accelerated");
	}
	
	public void changeGear() {
		System.out.println("Gear is changed");
	}
}
 
class LuxuryCar extends Car {
	public void changeGear() {
		System.out.println("Gear is changed automatically");
	}
	
	public void openSunRoof() {
		System.out.println("Sun roof opened");
	}
}

public class MethodOverridingCarExample {
	public static void main(String[] args) {
		Car c = new Car();
		c.startCar();
		c.accelerate();
		c.changeGear();
		
		System.out.println();
		
		LuxuryCar lc = new LuxuryCar();
		lc.startCar();
		lc.accelerate();
		lc.changeGear();
		lc.openSunRoof();
		
		System.out.println();
		
		Car c2 = new LuxuryCar();
		c2.startCar();
		c2.accelerate();
		c2.changeGear();
		
		//Car cannot refer extra features of luxury car
		//c2.openSunRoof();
	}
}