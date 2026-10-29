import java.util.Scanner;

public class DuckingExceptionVersion2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Main method exceution started.");
		
			divide();
		
		
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
