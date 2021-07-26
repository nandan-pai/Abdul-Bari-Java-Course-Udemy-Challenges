class TestStatic {
	static {
		System.out.println("Block 1");
	}
	
	static {
		System.out.println("Block 2");
	}
}

public class StaticBlockPractice {
	static {
		System.out.println("Block before main");
	}
	
	//Observe that block before main and block after main is printed first 
	//=> static blocks are executed before creating object of class once the class gets loaded
	public static void main(String[] args) {
		System.out.println("Main method");
		TestStatic ts = new TestStatic();
	}
	
	static {
		System.out.println("Block after main");
	}
}