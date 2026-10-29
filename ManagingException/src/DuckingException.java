import java.util.Scanner;

public class DuckingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method exceution started.");
		try {
			divide();
		}
		catch(Exception e) {
			System.out.println("Exception handled in main method.");
		}
		System.out.println("Main method exceution completed.");
		}
		public static void divide() throws Exception {
			
				System.out.println("Divide method started.");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a: ");
				int a = sc.nextInt();
				System.out.println("Enter b: ");
				int b = sc.nextInt();
				int c = a/b;
				System.out.println(c);
		}


}
