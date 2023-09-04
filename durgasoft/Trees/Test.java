public class Test 
{
	public static void main(String[] args)
	{
		BT tree = new BT();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		
		System.out.println(tree.root.data);//10
		System.out.println(tree.root.left.data);//20
		System.out.println(tree.root.right.data);//30;
	}
}