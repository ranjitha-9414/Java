
public class Conductor {

	void collect(Ticket t) {
		System.out.println("Collected Money.");
	}
	
	Ticket issue() {
		
		Ticket t = new Ticket();
		return t;
	}
}
