
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hospital hp = new Hospital();
		
		Thread t1 = new Thread(hp);
		Thread t2 = new Thread(hp);
		
		t1.setName("Tom");
		t2.setName("Jerry");
		
		t1.start();
		t2.start();
	}

}
