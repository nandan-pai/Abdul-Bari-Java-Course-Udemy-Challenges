class Account {
	int accno;
	String name, address, phno, dob;
	double balance;
	
	public int getaccno() {
		return accno;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public String getDob() {
		return dob;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getPhno() {
		return phno;
	}
	
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void closeAcc() {
		
	}
	
	public Account(int acno, String n, String address, String phno, String dob) {
		accno = acno;
		name = n;
		this.address = address;
		this.phno = phno;
		this.dob = dob;
		balance = 0;
	}
} 

class savingsAcc extends Account {
	public savingsAcc(int accno, String name, String address, String phno, String dob) {
		super(accno, name, address, phno, dob);
	}

	double fdPrincipal;
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void fixedDeposit(double principal) {
		fdPrincipal = principal;
	}
	
	public double liquidate() {
		return fdPrincipal + fdPrincipal * (double)(6/100);
	}
}

class loanAcc extends Account {
	public loanAcc(int accno, String name, String address, String phno, String dob) {
		super(accno, name, address, phno, dob);
	}

	public void payEmi(double amount) {
		balance -= amount;
	}
	
	public void repayment(double repayamount) {
		if(balance == repayamount)balance = 0;
	}
}

public class InheritanceChallenge {
	public static void main(String[] args) {

	}
}