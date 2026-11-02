import java.util.Scanner;

public class Printing extends Thread{

	@Override
	public void run(){
		System.out.println("Printing Activity started.");
		for(int i =0;i<5;i++) {
			System.out.println("Kodnest..");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing Activity Completed.");
	}
}
