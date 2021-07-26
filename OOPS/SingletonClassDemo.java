class CoffeeMachine {
	private float milkQty;
	private float sugarQty;
	private float coffeeQty;
	private float waterQty;
	static private int maxInstances = 5;
	
	static private CoffeeMachine obj = null;
	
	
	private CoffeeMachine() {
		milkQty = 1;
		sugarQty = 1;
		coffeeQty = 1;
		waterQty = 1;
	}
	
	public void fillWater(float qty) {
		waterQty = qty;
	}
	
	public void fillSugar(float qty) {
		sugarQty = qty;
	}
	
	public void fillMilk(float qty) {
		milkQty = qty;
	}
	
	public void fillCoffee(float qty) {
		coffeeQty = qty;
	}
	
	public float getCoffee() {
		return 0.23f;
	}
	
	public static CoffeeMachine getInstance() {
		if(maxInstances >= 1) {
			obj = new CoffeeMachine();
			maxInstances--;
			return obj;
		} else {
		return null;
		}
	}
}

public class SingletonClassDemo {
	public static void main(String[] args) {
		CoffeeMachine m1 = CoffeeMachine.getInstance();
		CoffeeMachine m2 = CoffeeMachine.getInstance();
		CoffeeMachine m3 = CoffeeMachine.getInstance();
		CoffeeMachine m4 = CoffeeMachine.getInstance();
		CoffeeMachine m5 = CoffeeMachine.getInstance();
		CoffeeMachine m6 = CoffeeMachine.getInstance();
		CoffeeMachine m7 = CoffeeMachine.getInstance();

		

		System.out.println(m1 + " " + m2 + " " + m3 + " " + m4 + " " + m5 + " " + m6 + " " + m7);
		if(m1 == m2 && m2 == m3 && m3 == m4 && m4 == m5 && m5 == m6 && m6 == m7) {
			System.out.println("Same objects");
		}
	}
}