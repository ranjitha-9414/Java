import java.util.*;
public class ManageExceptionLocally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method exceution started.");
		divide();
		System.out.println("Main method exceution completed.");
	}
	public static void divide() {
		try {
			System.out.println("Divide method started.");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a: ");
			int a = sc.nextInt();
			System.out.println("Enter b: ");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Exception handled in divided method.");
		}
		System.out.println("Divide method completed.");
	}

}
