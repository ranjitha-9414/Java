import java.util.Scanner;

public class OneDAarray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the elements: ");
		 int a[] = new int[5];
		 
		 for(int i = 0; i<= a.length-1; i++) {
			 a[i] = sc.nextInt();
		 }
		 
		 System.out.println("The elements are: ");
		 
		 for(int i = 0; i <= a.length-1; i++) {
			 System.out.println(a[i]);
		 }
	}

}
