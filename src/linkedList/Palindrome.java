package linkedList;

//i dont understand this problem
public class Palindrome {

	public static void main(String[] args) {
		
		Node node = new Node(0);
		node.appendToTail(1);
		node.appendToTail(2);
		node.appendToTail(1);
		node.appendToTail(0);
		
		Node reversed = reverseAndClone(node);
		System.out.println("Is Palindrome ::: "+ equal(node , reversed));

		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		
	}

	private static boolean equal(Node one, Node two) {
		while (one != null && two != null) {
			if (one.data != two.data) {
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return one == null && two == null;
	}

	private static Node reverseAndClone(Node node) {
		Node head = null;
		while(node!=null) {
			//create Temp Node
			Node tempNode = new Node(node.data);
			//copy values
			tempNode.next = head;
			head = tempNode;
			//Move to next value
			node = node.next;
		}
		return head;
	}

	
}
