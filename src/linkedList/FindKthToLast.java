package linkedList;

import java.util.HashSet;

public class FindKthToLast {

	public static void main(String[] args) {
		
		Node n = new Node(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
		n.appendToTail(6);
		n.appendToTail(7);
		n.appendToTail(8);
		int kthTOLast = 3,count=0;
		
		my_findKthToLast(n, kthTOLast, count);
		
		
	}

	private static void my_findKthToLast(Node n, int kthTOLast, int count) {
		// time - O(n) space O(1)
		Node current = n;
		while(current!=null) {

			if(count!=kthTOLast) {
				count++;
			}
			current= current.next;

			Node runner = n;
			while(runner.next!=null && current !=null && count==kthTOLast) {
				runner = runner.next;
				current = current.next;
			}

			if(current==null)
				System.out.println("KthtoLast is "+runner.data );
		}
	}
}
