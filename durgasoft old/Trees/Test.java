class BT 
{
	Node root;
	BT()
	{
		root = null;
	}
}
class Node
{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class Test
{
	public static void main(String[] args) {
        BT tree = new BT();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);
		tree.inOrder(tree);
		// System.out.println(tree.root.data);//10
		// System.out.println(tree.root.left.data);//20
		// System.out.println(tree.root.right.data);//30;
    }

}