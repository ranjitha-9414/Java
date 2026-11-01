import java.util.*;
public class SingleThreaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Entered number is: " + n);
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		int res = a+b;
		System.out.println("Addition result is: " + res);
		
	}

}
