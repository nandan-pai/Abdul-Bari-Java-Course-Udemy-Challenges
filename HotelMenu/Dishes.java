class Dishes {
	String dishName;
	int price;
	
	public Dishes(String dishName, int price) {
		this.dishName = dishName;
		this.price = price;
	}
}

class Menu extends Dishes{
	Dishes dishesMenu[] = new Dishes[100];
	int dishCount = 0;
	
	public Menu(String dName, int price) {
		super(dName, price);
	}
	
	public void addItem(String dName, int price) {
		dishesMenu[dishCount] = new Dishes(dName, price);
		dishCount++;
	}
	
	public void show() {
		System.out.println("        ITEM               PRICE");
		System.out.println("--------------------------------------------");
		for(int i = 0; i < dishCount; i++) {
			System.out.format("%s%-20s %d\n","\t",dishesMenu[i].dishName, dishesMenu[i].price);
		}
		System.out.println();
	}
}