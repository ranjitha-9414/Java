import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[3][];
		a[0] = new int [3];
		a[1] = new int[4];
		a[2] = new int [2];
		
		System.out.println("Enter the elements: ");
		for(int i = 0 ; i<a.length;i++) {
			for(int j = 0; j< a[i].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The elements are: ");
		for(int i = 0 ; i<a.length;i++) {
			for(int j = 0; j< a[i].length; j++) {
				System.out.print( a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
