
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child1 c1 = new Child1();
		accessMethod(c1);
		
		Child2 c2 = new Child2();
		accessMethod(c2);

	}
	
	static void accessMethod(Parent ref) {
		ref.disp1();
		ref.disp2();
		
		if(ref instanceof Child1) {
			((Child1)(ref)).disp3();
		}
		else {
			((Child2)(ref)).disp3();
		}
	}

}
