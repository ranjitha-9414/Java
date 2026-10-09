import java.util.Scanner;

public class ThreeDArraySum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int blocks = sc.nextInt();
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int a[][][] = new int[blocks][rows][cols];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				for(int k = 0;k<a[i][j].length;k++) {
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0; j<a[i].length;j++) {
				for(int k = 0;k<a[i][j].length;k++) {
					System.out.print(  a[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		for(int i = 0;i<a.length;i++) {
			int sum = 0;
			for(int j = 0; j<a[i].length;j++) {
				for(int k = 0;k<a[i][j].length;k++) {
					sum +=a[i][j][k];
				}
			}
			System.out.println("Sum in layer " + (i+1) + ": " + sum);
		}
	}
}
