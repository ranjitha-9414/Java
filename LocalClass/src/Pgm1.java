
public class Pgm1 {

	int a = 10;
	
	void myMethod() {
		
		class Pgm2 {
			int b = 20;
			
			void dispPgm2() {
				System.out.println(b);
			}
		}
		
		Pgm2 p2 = new Pgm2();
		p2.dispPgm2();
	}
	
	void dispPgm1() {
		System.out.println(a);
	}
}
