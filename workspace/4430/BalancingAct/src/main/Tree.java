package main;

import java.util.ArrayList;

public class Tree {
	Tree next;
	Node nodes;
	int count;
	int max;
	int depth;
	ArrayList<Node> list;
	
	public Tree(int depth,String root){
		this.depth=depth;
		this.max=(int) Math.ceil((2^depth)+1);
		this.nodes= new Node(root);
		this.count=0;
		this.list = new ArrayList<Node>();
		this.list.add(nodes);
	}
	public String getString(int index){
	return	this.list.get(index).getString();
		
	}
	public void addNode(String var, int index, Node r){
		
		//figure out right or left
		this.list.add(index, r );
		
	}
	public boolean isEmpty(int tree){
		if(this.count==0){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean isFull(int tree){
		if(this.list.size()==max){
			return true;
		}
		else{
			return false;
		}
		
	}
	public int getCount(){
	
		return this.list.size();
	}
	public int getDepth(int tree){
		int height =0;
		int hey=0;
		for(int i=0;i<128;i++){
			if(Tree[tree][i]!=null){
			height+=1;
			i=(i*2+1);
			}else {i=128;}
		}
		for(int i=0;i<128;i++){
			if(Tree[tree][i]!=null){
				hey+=1;
				i=(i*2);
			}else {i=128;}
			//hey+=1;
		}
		if(hey>=height){
			return hey;
		}else{
			return height;
		}
	}
}
