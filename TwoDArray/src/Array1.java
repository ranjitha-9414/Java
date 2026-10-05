import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int[3][5];
		System.out.println("Enter the elements: ");
		
		for(int i = 0; i<= 2; i++) {
			for(int j= 0; j<= 4;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The elements are: ");
		
		for(int i = 0; i<= 2; i++) {
			for(int j= 0; j<= 4;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
