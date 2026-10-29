import java.util.Scanner;

public class pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main method exceution started.");
		try {
			divide();
		}
		catch(Exception e) {
			System.out.println("Exception handled in main method.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
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
				throw e;
			}
			finally {
				System.out.println("Divide method completed.");
			}
			
		}
	}


