package linkedList;

public class Node{
	int data;
	Node next = null;

	public Node (int d) {
		data = d;
	}



	public Node() {
		// TODO Auto-generated constructor stub
	}



	void appendToTail(int d) {
		//create new node
		Node end = new Node(d);
		Node n = this;
		//iterate
		while(n.next != null ) {
			n = n.next;
		}
		//append at last
		n.next = end;
	}


	Node deleteNode(Node head,int d) {
		Node n = head;
		//If first node to delete
		if(head.data == d) {
			return head.next;
		}
		while(n.next!=null) {
			if(n.next.data == d) {
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}

	Node deleteNodeModified(Node head,int d) {
		//Node n = head;
		//If first node to delete
		if(head.data == d) {
			return head.next;
		}
		while(head.next!=null) {
			if(head.next.data == d) {
				head.next = head.next.next;
				return head;
			}
			head = head.next;
		}
		return head;
	}




}



