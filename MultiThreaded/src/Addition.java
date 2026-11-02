import java.util.Scanner;

public class Addition extends Thread {

	@Override
	public void run() {
		System.out.println("Addition activity started..");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b= sc.nextInt();
		int res = a+b;
		System.out.println("Addition result is: " + res);
		System.out.println("Addition activity Completed.");
	}
}
