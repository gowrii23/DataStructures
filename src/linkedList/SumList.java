package linkedList;

//i dont understand this problem
public class SumList {

	public static void main(String[] args) {
		
		Node node1 = new Node(7);
		node1.appendToTail(1);
		node1.appendToTail(6);
		
		Node node2 = new Node(5);
		node2.appendToTail(9);
		node2.appendToTail(2);
		
		Node node3 = new Node();
		int carry = 0;
		
		//Not a perfect solution
		while(node1!=null && node2!=null) {
			
			int unitPlace  = (node1.data + node2.data ) % 10;
			node3.appendToTail(unitPlace + carry);
			
			carry = (node1.data + node2.data ) / 10;
			node1 = node1.next;
			node2 = node2.next;
			System.out.println(node3.data+ "-->");
			node3 = node3.next;
			
			
		}

		while(node3!=null) {
			System.out.println(node3.data);
			node3 = node3.next;
		}
		
	}

	
}
