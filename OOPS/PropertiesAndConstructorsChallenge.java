class Product {
	String itemno;
	String itemname;
	double price;
	int quantity;
	
	public Product(String itno) {
		itemno = itno;
	}
	
	public Product(String itno, String itname) {
		itemno = itno;
		itemname = itname;
	}
	
	public Product(String itno, String itname, double prc, int qty) {
		itemno = itno;
		itemname = itname;
		price = prc;
		quantity = qty;
	}
	
	public String getitemno() {
		return itemno;
	}
	
	public String getitemname() {
		return itemname;
	}
	
	public double getprice() {
		return price;
	}
	
	public int getquantity() {
		return quantity;
	}
	
	public void setquantity(int q) {
		quantity = q;
	}
	
	public void setPrice(double prc) {
		price = prc;
	}
}

class Customer {
	String customerid, customername, address, phoneno;
	
	public Customer(String cusid, String name) {
		customerid = cusid;
		customername = name;
	}
	
	public Customer(String cusid, String name, String add, String pno) {
		customerid = cusid;
		customername = name;
		address = add;
		phoneno = pno;
	}
	
	public String getcustomerid() {
		return customerid;
	}
	
	public String getcustomername() {
		return customername;
	}
	
	public String getaddress() {
		return address;
	}
	
	public String getphoneno() {
		return phoneno;
	}
	
	public void setAddress(String add) {
		address = add;
	}
	
	public void setPhoneno(String phno) {
		phoneno = phno;
	}
} 

public class PropertiesAndConstructorsChallenge {
	public static void main(String[] args) {
		
	}
}