import java.util.Scanner;

public class OneDArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		System.out.println("Enter the elements: ");
		int a[] = new int[size];
		for(int i = 0; i <= a.length-1; i++) {
			a[i]= sc.nextInt();
		}
		
		System.out.println("The elements are: ");
		System.out.print("[ ");
		
		for(int i = 0; i<= a.length-1;i++) {
			if(i != size -1) {
				System.out.print(a[i]+ ", ");
			}
			else {
				System.out.print(a[i]);
			}
		}
		System.out.println("]");
	}

}
