
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer pc = new Printer();
		
		Thread t1 = new Thread(pc);
		Thread t2 = new Thread(pc);
		Thread t3 = new Thread(pc);
		
		t1.setName("JavaDeveloper");
		t2.setName("PythonDeveloper");
		t3.setName("CDeveloper");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
