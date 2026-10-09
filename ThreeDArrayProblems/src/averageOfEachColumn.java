import java.util.Scanner;

public class averageOfEachColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int blocks = sc.nextInt();
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int a[][][] = new int[blocks][rows][cols];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				for(int k = 0;k<a[i][j].length;k++) {
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(int i = 0;i<a.length;i++) {
			System.out.println("Block : " +(i+1) );
			for(int j = 0;j<a[i].length;j++) {
				for(int k = 0;k<a[i][j].length;k++) {
					System.out.println(a[i][j][k] + " ");
				}
			}
		}
		
		for(int j = 0; j<rows;j++) {
			for(int k = 0;k<cols; k++) {
				int sum =0;
				for(int i = 0; i< blocks; i++) {
					sum += a[i][j][k];
				}
				double avg = sum/blocks;
				System.out.println("Avg of " + "(" + j + ", " + k +")" +" : " + avg);
			}
		}
	}

}
