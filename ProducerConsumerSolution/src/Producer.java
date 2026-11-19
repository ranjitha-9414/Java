
public class Producer implements Runnable {
	
	Factory factory;
	
	public Producer(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		try {
			int x = 1;
			while(true) {
				factory.setData(x++);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
