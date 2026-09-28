
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child1();
		p.disp1();
		p.disp2();
		//p.disp3();//Error
		
		((Child1)(p)).disp3();
		
	}

}
