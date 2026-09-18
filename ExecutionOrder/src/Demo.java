
public class Demo {

	Demo() {
		System.out.println("Constructor executed...");
	}
	
	static {
		System.out.println("Static block executed...");
	}
	
	static {
		System.out.println("2nd static block executed...");
	}
	
	{
		System.out.println("Non static block executed...");
	}
}
