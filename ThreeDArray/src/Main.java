import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a[][][] = new int[3][3][5];
		
		System.out.println("Enter the elements: ");
		
		for(int i = 0; i<= a.length-1;i++) {
			for(int j = 0; j<= a[i].length-1;j++) {
				for(int k = 1; k<= a[i][j].length-1;k++) {
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("The elements are: ");
		
		for(int i = 0; i<a.length;i++) {
			System.out.println("The Block: " + i);
			for(int j = 0; j<a[i].length;j++) {
				System.out.println("Row: " + j);
				for(int k = 0; k< a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
