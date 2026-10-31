
public class Pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = Thread.currentThread();
		System.out.println(t);
		
		t.setName("Ranj");
		System.out.println(t);
		
		t.setPriority(8);
		System.out.println(t);
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(t);
		
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getClass());
	}

}
