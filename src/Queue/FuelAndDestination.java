package Queue;

public class FuelAndDestination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] input = {{10,5} , {2,7} , {3,4} , {4,2} , {2,1}};
		QueueIndex<Integer,Integer> queue = new QueueIndex<Integer,Integer>();

		queue.push(10,5);
		queue.push(2,7);
		queue.push(3,4);
		queue.push(4,2);
		queue.push(2,1);
				
		
		/*Create loop for testing */
		queue.top.next.next.next.next.next = queue.top;
		
		
		
		while(!queue.isEmpty()) {
			System.out.println(" "+ queue.pop().getData());
		}
	}

}
