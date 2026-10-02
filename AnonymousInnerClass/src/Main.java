
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program p1 = new Program(){
			@Override
			void display() {
				System.out.println("inside display.");
			}
		};
		p1.display();
	}

}
