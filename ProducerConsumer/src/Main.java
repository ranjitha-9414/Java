
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory factory = new Factory();
		
		Producer producer = new Producer(factory);		
		Consumer consumer = new Consumer(factory);
		
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		
		t1.start();
		t2.start();
	}

}
