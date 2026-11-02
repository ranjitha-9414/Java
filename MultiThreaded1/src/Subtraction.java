import java.util.*;
public class Subtraction  extends Thread{

	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Subtraction activity started.");
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		int res = a-b;
		System.out.println("Substraction result is " + res);
		System.out.println("Subbtraction activity completed.");
	}
}
