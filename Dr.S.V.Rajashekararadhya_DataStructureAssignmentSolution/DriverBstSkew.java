package com.greatlearning.driver;

class DriverBstSkew {
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	//Method 
	//ST to Skew 

	 static void flattenBTToSkewed(Node root,int order){

	 // Base Case
			 if(root == null)
			 {
			     return;
			 }
			
			 // order check
			 
			 if(order > 0)
			 {
			     flattenBTToSkewed(root.right, order);
			 }
			 else
			 {
			     flattenBTToSkewed(root.left, order);
			 }
			 Node rightNode = root.right;
			 Node leftNode = root.left;
			
			 // root Node
			 // 
			 if(headNode == null)
			 {
			     headNode = root;
			     root.left = null;
			     prevNode = root;
			 }
			 else
			 {
			     prevNode.right = root;
			     root.left = null;
			     prevNode = root;
			 }
			
			 //recurse left / right
			 
			 if (order > 0)
			 {
			     flattenBTToSkewed(leftNode, order);
			 }
			 else
			 {
			     flattenBTToSkewed(rightNode, order);
			 }
     }
	
	 //traverse method
	
	static void traverseRightSkewed(Node root){
			 if(root == null)
			 {
			     return;
			 }
			 System.out.print(root.val + " ");
			 traverseRightSkewed(root.right);       
	}



	public static void main (String[] args) {
						//  50
						//  / \
						//30   60
							//  /    /
							// 10   55
		DriverBstSkew tree = new DriverBstSkew();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		
		// Order of the Skewed tree can
		// be defined as follows -
		// For Increasing order - 0
		// For Decreasing order - 1
		int order = 0;
		flattenBTToSkewed(node, order);
		traverseRightSkewed(headNode);
	}
}

