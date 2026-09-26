
public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conductor c = new Conductor();
		Ticket t = new Ticket();
		
		c.collect(t);
		System.out.println(c.issue());
		Ticket t1= c.issue();
		System.out.println(t1);

	}

}
