import java.util.LinkedList;
import java.util.Queue;

public class QueuePoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new LinkedList();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		System.out.println(q);
		
		System.out.println(q.poll());
	}

}
