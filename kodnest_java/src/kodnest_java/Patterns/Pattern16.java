package kodnest_java.Patterns;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--) {
			for(int k=1;k<=5-i+1;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Another way 
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<= 9-2*i+2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
