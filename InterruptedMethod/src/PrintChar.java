import java.util.Scanner;

public class PrintChar extends Thread{

	@Override
	public void run() {
		
		System.out.println("Printing Char  activity started.");
		
		for(char i='A';i<='Z';i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing Char activity comnpleted.");

	}
}
	
