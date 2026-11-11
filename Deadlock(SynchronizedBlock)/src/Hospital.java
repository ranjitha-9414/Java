
public class Hospital implements Runnable {
	
	String res1 = "Bed";
	String res2 = "Doctor";
	
	@Override
	public void run() {
		String threadName= Thread.currentThread().getName();
		
		if(threadName.equals("Tom")) {
			tomTreatment();
		} else {
			jerryTreatment();
		}
	}
	
	void tomTreatment() {
		try {
			synchronized (res1) {
				System.out.println("Tom has occupied " + res1);
				Thread.sleep(3000);
				
				synchronized (res2) {
					System.out.println("Tom has ocuupied " + res2);
					Thread.sleep(3000);
					System.out.println("Tom has released " + res2);
				}
				System.out.println("Tom has released " + res1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	void jerryTreatment() {
		try {
			synchronized (res1) {
				System.out.println("jerry has occupied " + res1);
				Thread.sleep(3000);
				
				synchronized (res2) {
					System.out.println("jerry has ocuupied " + res2);
					Thread.sleep(3000);
					System.out.println("jerry has released " + res2);
				}
				System.out.println("Jerry has released " + res1);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
