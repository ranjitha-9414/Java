import java.util.*;
public class PrintCharacter extends Thread {

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing activity started.");
		
		for(char i='A';i<='Z';i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing activity comnpleted.");
	}
}
