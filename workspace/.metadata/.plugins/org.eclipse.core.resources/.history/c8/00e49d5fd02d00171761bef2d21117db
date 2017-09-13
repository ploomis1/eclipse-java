package main;

public class Tree {
	private String [][] Tree;
	Tree hey;
	Tree next;
	//Node nodes;
	int count;
	int max;
	int depth;
	
	
	public Tree(int depth){
		this.depth=depth;
		this.max=(int) Math.ceil((2^depth)+1);
		//this.nodes= new Node(depth);
		this.count=0;
		Tree= new String [128][128];
	}
	public String getString(int tree, int index){
		return Tree[tree][index];
		
	}
	public void addNode(int tree,String var,int index){
		
		Tree[tree][index]=var;
		
		 this.count++;
		
	}
	public boolean isEmpty(int tree){
		if(Tree [tree][0]==null){
			return true;
		}
		else{
			return false;
		}
	}
	/*public int rightDepth(){
		int height=0;
		for(int i=0;i<128;i++){
			if(Tree[tree][i]!=null){
			height+=1;
			i=(i*2+1);
			}else if(Tree[tree][i-1]!=null){
				height+=1;
				i=(i*2+1);
			}
			else{
				i=128;
			}
		}
		
	}
	public int leftDepth(){
		for(int i=0;i<128;i++){
			if(Tree[tree][i]!=null){
			height+=1;
			i=(i*2+1);
			}else if(Tree[tree][i-1]!=null){
				height+=1;
				i=(i*2+1);
			}
			else{
				i=128;
			}
		}
	}*/
	public boolean isFull(int tree){
		if(getCount(tree)==max){
			return true;
		}else{
			return false;
		}
		
	}
	public int getCount(int tree){
		int height =0;
	
		for(int i=0;i<128;i++){
			if(Tree[tree][i]!=null){
			height+=1;
			
			}else{
				i=128;
			}
		
	}
		return height;
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
	private int parent(int pos) {
		return pos / 2;
	}

	/*
	 * gets left child
	 */
	private int leftChild(int pos) {
		return (2 * pos);
	}

	/*
	 * gets right child
	 */
	private int rightChild(int pos) {
		return (2 * pos) + 1;
	}

}
