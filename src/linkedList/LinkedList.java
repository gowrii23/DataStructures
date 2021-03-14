package linkedList;

public class LinkedList {

	public static void main(String[] args) {
		
		Node n = new Node(1);
		n.appendToTail(2);
		n.appendToTail(3);
		n.appendToTail(4);
		n.appendToTail(5);
		n.appendToTail(6);
		n.appendToTail(7);
		n.appendToTail(8);
		
		
		n.deleteNode(n, 4);
		
		n.deleteNodeModified(n, 6);

		while(n.next!=null) {
			System.out.println(n.data);
			n = n.next;
		}
		
	}




	}

