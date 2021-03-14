package linkedList;

import java.util.HashSet;

//i dont understand this problem
public class PartitionProblem {

	public static void main(String[] args) {
		
		Node node = new Node(1);
		node.appendToTail(9);
		node.appendToTail(8);
		node.appendToTail(2);
		node.appendToTail(3);
		node.appendToTail(4);
		node.appendToTail(3);
		node.appendToTail(6);
		node.appendToTail(1);
		node.appendToTail(1);

		int x=3;
		node = partition(node, x);



		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		
	}

	private static Node partition(Node node, int x) {
		Node head = node;
		Node tail = node;
	
		while (node != null) {
			Node next = node. next;
			if (node. data < x) {
				node. next = head;
				head = node;
			} else {
				tail.next = node;
				tail = node;
			}
			node = next;
		}
		tail.next = null;
		return head;
	}
	
}
