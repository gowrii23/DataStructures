package linkedList;

//i dont understand this problem
public class FindIntersection {

	public static void main(String[] args) {
		
		Node node2 = new Node(3);
		node2.appendToTail(1);
		node2.appendToTail(5);
		node2.appendToTail(9);
		node2.appendToTail(7);
		node2.appendToTail(2);
		node2.appendToTail(1);
		
		Node node1 = new Node(4);
		node1.appendToTail(6);
		node1.appendToTail(7);
		node1.appendToTail(2);
		node1.appendToTail(1);
		
		//Check for length and then take diff
		int diff = returnLength(node1) -  returnLength(node2) ;

		if(returnLength(node1) >  returnLength(node2)) {
			node1 = moveLargerNodeToDiffinLength(node1, diff);
			System.out.println("Difference in List length "+ diff);
			
			findIntersection(node1, node2);
		}else if(returnLength(node2) >  returnLength(node1)) {
			node2 = moveLargerNodeToDiffinLength(node2, -diff);
			System.out.println("Difference in List length "+ -diff);
			
			findIntersection(node2, node1);
		}
		
		

	}

	private static void findIntersection(Node node1, Node node2) {
		while(node1!=null && node2!=null) {
			if(node1.data == node2.data) {
				System.out.println("Intersection node is "+node1.data);
				break;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
	}

	private static Node moveLargerNodeToDiffinLength(Node node1, int diff) {
		int countDiff =0;
		while(node1!=null) {
			if(countDiff == diff) {
				break;
			}
			node1 = node1.next;
			countDiff++;
		}
		return node1;
	}

	private static int returnLength(Node node) {
		int count=0;
		while(node!=null) {
			count++;
			node = node.next;
		}
		return count;
	}

	
}
