//With Deamon thread
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TextEditor te = new TextEditor();
		
		Thread t1 = new Thread(te);
		Thread t2 = new Thread(te);
		Thread t3 = new Thread(te);
		
		t1.setName("Type");
		t2.setName("Check");
		t3.setName("Save");
		
		
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
