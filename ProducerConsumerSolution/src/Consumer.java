
public class Consumer implements Runnable {

	Factory factory;
	
	public Consumer(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				factory.getData();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
