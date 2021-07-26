class HondaCity {
	static int price = 1000000;
	
	public static double onRoadPrice(String city) {
		switch(city) {
		case "Mumbai": 
			return (price + price * 0.1);
		case "Delhi":
			return (price + price * 0.09);
		default: 
			return (price + price * 0.15);
		}
	}
}

public class StaticVariableMethodExample {
	public static void main(String[] args) {
		System.out.println("Honda City ex-showroom price: " + HondaCity.price);
		System.out.println("Delhi Honda City On road price: " + HondaCity.onRoadPrice("Delhi"));
		System.out.println("Mumbai Honda City On road price: " + HondaCity.onRoadPrice("Mumbai"));
		System.out.println("Bangalore Honda City On road price: " + HondaCity.onRoadPrice("Bangalore"));
	}
}