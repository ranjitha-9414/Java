import java.util.Scanner;

public class PrintNum extends Thread{

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Printing Number activity started.");
		
		for(int i=1;i<=5;i++) {
			System.out.println("Num: " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing Number activity comnpleted.");
	}
}
