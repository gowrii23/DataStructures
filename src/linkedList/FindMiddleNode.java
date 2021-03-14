package linkedList;

import java.util.HashSet;

public class FindMiddleNode {

	public static void main(String[] args) {
		
		Node n = new Node(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
		n.appendToTail(6);
		n.appendToTail(7);
		n.appendToTail(8);

		//Tortoise and Rabbit problem :: time O(n) space - O(1)
		SlowPointerFastPointer(n);
		
		deleteMiddleNode(n);
		
		while(n.next!=null) {
			System.out.println(n.data);
			n = n.next;
		}
		
		
		
	}

	private static void SlowPointerFastPointer(Node n) {
		Node current = n;
		Node runner = n;
		while(current.next!=null && runner.next!=null) {
			current = current.next;
			runner = runner.next.next;
			if(runner==null) {
				System.out.println("Midddle Element is "+ current.data);
				break;
			}
		}
	}

	private static void deleteMiddleNode(Node n) {
		Node current = n;
		Node runner = n;
		while(current.next!=null && runner.next!=null) {
			current = current.next;
			runner = runner.next.next;
			if(runner==null) {
				current.next = current.next.next;
				break;
			}
		}
	}
	
}
