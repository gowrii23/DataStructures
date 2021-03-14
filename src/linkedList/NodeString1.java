package linkedList;

public class NodeString1{
	String data;
	NodeString1 next = null;

	public NodeString1 (String d) {
		data = d;
	}



	public NodeString1() {
		// TODO Auto-generated constructor stub
	}



	void appendToTail(String d) {
		//create new node
		NodeString1 end = new NodeString1(d);
		NodeString1 n = this;
		//iterate
		while(n.next != null ) {
			n = n.next;
		}
		//append at last
		n.next = end;
	}


	NodeString1 deleteNode(NodeString1 head,String d) {
		NodeString1 n = head;
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

	NodeString1 deleteNodeModified(NodeString1 head,String d) {
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



