	package main;



public class Node {
	private Node leftchild;
	private	Node rightchild;
	private	String root;
	
	public Node(String root){
		this.root=root;
		
	}
	
	public String getString(){
		return this.root;
	}
	public void setRight(String var){
		this.rightchild.root=var;
	}
	public void setLeft(String var){
		this.leftchild.root=var;
	}
	public String getRight(){
		return this.rightchild.getString();
	}
	public String getLeft(){
		return this.leftchild.getString();
	
	}
	

}







