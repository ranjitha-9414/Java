import java.util.Scanner;

public class Activity implements Runnable{

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		if(threadName.equals("ADD")) {
			addition();
		}
		if(threadName.equals("CHAR")) {
			printChar();
		}
		if(threadName.equals("NUM")) {
			printNum();
		}
	}
	
	void addition() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Addition activity started.");
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		int res = a+b;
		System.out.println("Addition result is " + res);
		System.out.println("Addition activity completed.");
	
	}
	
	void printChar() {
		System.out.println("Printing Char  activity started.");
		
		for(char i='A';i<='E';i++) {
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
	
	void printNum() {
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
