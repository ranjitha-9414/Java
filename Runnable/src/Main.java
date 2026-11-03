
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add = new Addition();
		PrintNum pn = new PrintNum();
		PrintChar pc = new PrintChar();
		
		Thread t1 = new Thread(add);
		Thread t2 = new Thread(pn);
		Thread t3 = new Thread(pc);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
