
public class Program {
	
	public Program() {
		this(10);
		System.out.println("Inside zeo-PAR Constructor");
	}
	
	public Program(int a) {
		this(10, 20);
		System.out.println("Inside One-PAR Constrctor");
	}
	
	Program(int a, int b) {
		System.out.println("Inside Two-PAR Constructor");
	}

}
