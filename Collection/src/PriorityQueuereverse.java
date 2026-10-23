import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueuereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue pq = new PriorityQueue(Collections.reverseOrder());
		pq.add(100);
		pq.add(125);
		pq.add(175);
		pq.add(150);
		pq.add(25);
		pq.add(50);
		pq.add(75);
		System.out.println(pq);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
