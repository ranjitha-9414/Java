import java.util.Scanner;
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
			
			System.out.println("Enter the size of the array: ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			
			System.out.println("Enter the elements to be stored into the array: ");
			int element = sc.nextInt();
			
			System.out.println("Enter an index at which element to be inserted:  ");
			int index = sc.nextInt();
			arr[index] = element;
			System.out.println("The elements has been stored into the Array. ");
			
			} 
			
			catch(ArithmeticException e1) {
			System.out.println("Please don't enter the value of b is zero.");
			}
		
		
			catch(NegativeArraySizeException e2) {
				System.out.println("Don't enter negative size of the Array.");
			}
			catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please Access Array within Boundary.");
			}
		
			catch(Exception e) {
				System.out.println("Exception Handled....");
			}
			System.out.println("Connection Terminated.");
	}

}
