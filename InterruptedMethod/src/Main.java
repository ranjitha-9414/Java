
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintNum pn = new PrintNum();
		PrintChar pc = new PrintChar();
		
		pn.start();
		pc.start();
		
		pn.interrupt();
		pc.interrupt();
	}

}
