interface Member {
	void callback();
}

class Store  {
	Member m[] = new Member[100];
	int count = 0;
	
	void register(Member m) {
		this.m[count++] = m;
	}
	
	void inviteSale() {
		for(int i = 0 ; i < count ; i++) {
			m[i].callback();
		}
	}
}


class Customer1 implements Member {
	String name;
	Customer1(String name) {
		this.name = name;
	}
	
	public void callback() {
		System.out.println("Okay, I will visit the Store. P.S." + name);
	}
}

public class InterfaceCallbackChallenge {
	public static void main(String[] args) {
		Store s = new Store();
		Customer1 c1 = new Customer1("John");
		Customer1 c2 = new Customer1("Smith");
		s.register(c1);
		s.register(c2);
		s.inviteSale();
	}
}