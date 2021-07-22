package binaryTree;

public class BinaryRunner {

	public static void main(String[] args) {
		BinaryTree<Integer> myTree = new BinaryTree<>();
		myTree.add(56);
		myTree.add(30);
		myTree.add(70);
		myTree.print(myTree.root);
	}

}