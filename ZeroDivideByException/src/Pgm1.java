import java.util.*;
public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.out.println("Connection is Established: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println(c);
		} catch(Exception e) {
			System.out.println("Exception Handled....");
		}
		System.out.println("Connection Terminated.");
	}

}
