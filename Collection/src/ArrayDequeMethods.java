import java.util.*;
public class ArrayDequeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDeque dq = new ArrayDeque();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		
		System.out.println(dq);
		
		dq.addFirst(99);
		dq.addFirst(88);
		dq.addFirst(77);
		
		System.out.println(dq);
		
		System.out.println(dq.remove());
		System.out.println(dq.removeFirst());
		System.out.println(dq.removeLast());
		
		System.out.println(dq);
		
		System.out.println(dq.poll());
		System.out.println(dq);
		System.out.println(dq.pollFirst());
		System.out.println(dq);
		System.out.println(dq.pollLast());
		System.out.println(dq);
		
		System.out.println(dq.peek());
		System.out.println(dq);
		System.out.println(dq.peekFirst());
		System.out.println(dq);
		System.out.println(dq.peekLast());
		System.out.println(dq);
		
		System.out.println(dq.isEmpty());
		System.out.println("The elements are: ");
		while(!dq.isEmpty()) {
			System.out.println(dq.poll());
		}
	}

}
