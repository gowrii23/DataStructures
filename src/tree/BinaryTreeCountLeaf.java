package tree;

public class BinaryTreeCountLeaf {

	Node root;


	public static void main(String... args) {
		BinaryTreeCountLeaf tree = new BinaryTreeCountLeaf();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		tree.printLeavesCount();


	}

	void printLeavesCount(){
		System.out.println(countLeaves(root));
	}

	//Recursive way to count leaf
	private int countLeaves(Node node) {

		if(node==null){
			return 0;
		}
		//if no left or right node its a leaf
		if(node.left == null && node.right == null){
			return 1;
		}
		return countLeaves(node.left) + countLeaves(node.right);

	}
}
