
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		access(c1);
		access(c2);
	}
	
	static void access(Parent p) {
		if(p instanceof Child1) {
			((Child1)p).disp1();
			p.disp2();
		}
		else {
			p.disp1();
			p.disp2();
		}
	}

}
