import java.util.Scanner;

public class ArrayMinSum2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][4];
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		for(int i = 0; i<a.length;i++) {
			int min = a[i][0];
			for(int j = 0;j<a[i].length;j++) {
				if(a[i][j] < min) {
					min = a[i][j];
				}
			}
			sum += min;
		}
		
System.out.println("The elements are: ");
		
		for(int i = 0; i< a.length; i++) {
			for(int j= 0; j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The minimum sum of from each row in Array: " + sum);
	}

}
