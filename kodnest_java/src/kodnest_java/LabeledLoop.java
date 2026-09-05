package kodnest_java;

public class LabeledLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerLoop:
			for ( int i = 1; i<= 5; i++) {
				for(int j = 1; j <= 5 ; j++) {
					if (i*j > 10) {
						System.out.println("Breaking out of both loops!");
						continue outerLoop;
					}
					System.out.println("i: " + i + ", j: " + j + " i*j: " + i*j);
				}
			}
	}

}
