
public class Pgm1 {

int a= 10;
	
	static class Pgm2 {
		static int b= 20;
		
		static void dispPgm2() {
			System.out.println(b);
		}
	}
	
	void dispPgm1() {
		System.out.println(a);
	}
}
