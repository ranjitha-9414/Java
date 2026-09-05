package kodnest_java;

public class nested {
	public static void main (String[] args) {
		for(int i = 1; i<=3 ; i++) {
			for(int j = 1; j <= 5; j++ ) {
				System.out.println(j);
			}
			System.out.println("");
		}
		
		for(int i = 1; i<=3 ; i++) {
			for(int j = 1; j <= 5; j++ ) {
				System.out.println("i: " + i + " j: " + j);
			}
			System.out.println("");
		}
		
		//while loop
		
		int i = 1;
		while(i<=3) {
			int j = 1;
			while (j<=5) {
				System.out.println("i is " + i + " j is " + j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
