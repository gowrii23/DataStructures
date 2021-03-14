package linkedList;

import java.util.HashSet;

public class DeleteDuplicates {
	public static void main(String[] args) {

		Node n = new Node(1);
		n.appendToTail(2);
		n.appendToTail(4);
		n.appendToTail(3);
		n.appendToTail(5);
		n.appendToTail(4);
		n.appendToTail(7);
		n.appendToTail(8);

		//Using Buffer space: time -  O(n), space O(n)
		/* my_deleteDuplicate(n); */
		//Using Buffer space: time - O(n), space O(n)
		/* deleteDups(n); */
		
		//Whithout buffer space: time - O(n^2) ,  space - O(1)
		deleteDuplicateNoBufferMemory(n);
		
		
		while(n.next!=null) {
			System.out.println(n.data);
			n = n.next;
		}

	}

	private static void deleteDuplicateNoBufferMemory(Node n) {
		Node current = n;
		while(current!=null) {

			Node runner = current;
			while(runner.next!=null) {
				if(current.data==runner.next.data) {
					runner.next = runner.next.next;
				}else {
					runner = runner.next;
				}
			}
			current= current.next;
		}
	}

	private static void my_deleteDuplicate(Node n) {
		//Operate on Head Node
		Node head = n;
		HashSet<Integer> set = new HashSet<>();
		while(head.next!=null) {
			if(set.contains(head.data)) {
				head.next = head.next.next;
			}else {
				set.add(head.data);
				head = head.next;
			}
		}
	}

	static void deleteDups(Node n) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node previous = null;
		while (n != null) {
			if (set.contains(n.data)) {
				previous. next = n.next;
			} else {
				set.add(n.data);
				previous = n;
			}
			n = n.next;
		}
	}



}
