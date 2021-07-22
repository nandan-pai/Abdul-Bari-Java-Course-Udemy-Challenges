public class Main {
	public static void main(String[] args) {
		Menu m = new Menu();
		m.addItem("Idli", 20);
		m.addItem("Vada", 10);
		m.show();
		m.addItem("Poori", 50);
		m.addItem("Masala Dosa", 40);
		m.addItem("Chole Bhature", 50);
		m.show();
	}
}
