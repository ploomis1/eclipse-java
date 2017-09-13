package node;

import node.Node;

public class TreeDataStructure implements Node {
	private String ID;
	private Node leftChild;
	private Node rightChild;
	private Node parent;
	private int nodes;

	// private Node children [];
	// array of children

	public TreeDataStructure(String root) {
		nodes = 1;
		this.ID = root;
		// this.leftChild = null;
		// this.rightChild = null;
		// this.children

	}

	public TreeDataStructure(String id, Node parent) {
		// this.leftChild=id;
		this.parent = parent;
		this.ID = id;
		this.leftChild = null;
		this.rightChild = null;
	}

	@Override
	public boolean addChild(String ID, String parentID) {// r
		if (parentID.equals(getId())) {
			if (leftChild == null) {
				// this.nodes = (nodes + 1);
				this.leftChild = new TreeDataStructure(ID, this);

				return true;

			} else if (rightChild == null) {

				// this.nodes = (nodes + 1);
				this.rightChild = new TreeDataStructure(ID, this);
				return true;
			}
		}
		// checks left then checks right in a recurssive matter

		// if make return true

		// one must make sure current root equals parentID; if so make sure it
		// is going to be left or right child or check
		// then add it and return if it was added; if it is added print out
		// it was in this method

		else {
			if (leftChild != null) {
				boolean hello = this.leftChild.addChild(ID, parentID);
				if (hello == true) {
					return true;
				}

				if (rightChild != null) {
					// return rightChild.addChild(ID, parentID);
					boolean hi = this.rightChild.addChild(ID, parentID);
					if (hi == true) {
						return hi;
					} else {
						return false;
					}
				}

			}

		}
		return false;
	}

	@Override
	public Node find(String value) {// r

		// BSTNode currentNode = node;

		// if (value == parent){
		// return parent
		// } else if (value currentNode.getData()){
		// find(.getLeftNode(), value);
		// } else{
		// findValueRecursively(currentNode.getRightNode(), value);
		// }

		if (leftChild.equals(value)) {
			return leftChild;
		}

		else if (rightChild.equals(value)) {

			return rightChild;
		}

		if (leftChild.equals(value)) {
			return leftChild.find(value);
		}

		else if (!rightChild.equals(value)) {

			return rightChild.find(value);
		}
		// TODO Auto-generated method stub
		// return parent
		else {
			return this;
		}
	}

	@Override
	public Node getParent() {
		// TreeDataStructure node = new TreeDataStructure(ID);
		// TODO Auto-generated method stub
		return this;
		// TODO Auto-generated method stub

	}

	@Override
	public int size() {// r

		if (leftChild != null) {
			nodes = nodes + 1;
			return leftChild.size();
		}

		if (rightChild != null) {
			nodes = nodes + 1;
			return rightChild.size();
		}
		// TODO Auto-generated method stub
		return nodes;
	}

	@Override
	public String toString() {

		String str = (parent + " " + ID);

		// need to print parent the left then right child
		// return TreeDataStructure(this.parent,this.ID);
		return str;
	}

	@Override
	public String getId() {

		// TODO Auto-generated method stub

		// returning root/ node im at
		return ID;
	}

	@Override
	public void printTree() {// rec
		// TODO Auto-generated method stub
		if (leftChild != null) {
			System.out.println(leftChild.toString());
			leftChild.printTree();
		}

		if (rightChild != null) {
			System.out.println(rightChild.toString());
			rightChild.printTree();
		}

	}

}
