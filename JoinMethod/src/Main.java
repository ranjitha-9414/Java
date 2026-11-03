
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Thread started and opened the file");
		
		Addition add = new Addition();
		PrintNum pn = new PrintNum();
		PrintChar pc = new PrintChar();
		
		Thread t1 = new Thread(add);
		Thread t2 = new Thread(pn);
		Thread t3 = new Thread(pc);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Main thread completed and closing the file");
	}
}
