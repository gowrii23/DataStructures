package tree;

public class BinaryTree {

	Node root;
	 
    BinaryTree()
    {
        root = null;
    }
 
	/*
	 *  InOrder 
	 *  =======
	 *  L, root, R
	 *  
	 */
    void inOrder(Node node)
    {
        if (node == null)
            return;
 
        //L
        inOrder(node.left);
        
        //root
        System.out.print(node.key + " ");
 
        //R
        inOrder(node.right);
    }
    
    void printInorder()    { 
    	inOrder(root);  
    }
    
	public static void main(String... args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		tree.printInorder();

		
	}
}
