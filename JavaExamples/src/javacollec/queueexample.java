package javacollec;

import java.util.PriorityQueue;

public class queueexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PriorityQueue<String> PQQ = new PriorityQueue<String>();
		
		PQQ.add("Riju");
		PQQ.add("Ciju");
		PQQ.add("Viju");
		PQQ.add("Giju");
		PQQ.add("Hiju");
		
		
		System.out.println(PQQ.toString());
		
		PQQ.poll();
		
		System.out.println(PQQ.toString());

		
		System.out.println(PQQ.poll());
		System.out.println(PQQ.peek());
		
		System.out.println(PQQ.toString());
		
	}

}
