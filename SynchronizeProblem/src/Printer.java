
public class Printer implements Runnable{

	@Override
	public void run() {
		try {
			String threadName = Thread.currentThread().getName();
			Thread.sleep(3000);
			System.out.println(threadName + " is started using Printer.");
			Thread.sleep(3000);
			System.out.println(threadName + " is  using Printer.");
			Thread.sleep(3000);
			System.out.println(threadName + " is stopped using Printer.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
