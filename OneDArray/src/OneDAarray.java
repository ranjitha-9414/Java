import java.util.Scanner;

public class OneDAarray {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the elements: ");
	 int a[] = new int[5];
	 
	 for(int i = 0; i<= 4; i++) {
		 a[i] = sc.nextInt();
	 }
	 
	 System.out.println("The elements are: ");
	 
	 for(int i = 0; i <= 4; i++) {
		 System.out.println(a[i]);
	 }
 }
}
