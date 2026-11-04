
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Activity ac = new Activity();
		
		Thread t1 = new Thread(ac);
		Thread t2 = new Thread(ac);
		Thread t3 = new Thread(ac);
		
		t1.setName("ADD");
		t2.setName("CHAR");
		t3.setName("NUM");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
