package kodnest_java.Patterns;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				for (int i = 5; i >=1; i--) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				//another way
				

				System.out.println();
				for (int i = 1; i <=6; i++) {
					for (int j = 1; j <= 6-i+1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
	}

}
