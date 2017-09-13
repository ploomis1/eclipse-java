package main;

import java.util.Random;
import java.util.Scanner;


public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 long start = System.currentTimeMillis();;
		// TODO Auto-generated method stub
		Random rand = new Random();// call random class
		
		Scanner kbd = new Scanner(System.in);
		
		//kbd.close();
		int i= 100;//number of integers in tree
		int k= 10000;//max number int node can be
		int l;
		//int key=5;
		int key= rand.nextInt(1000);
		
		int operation= (rand.nextInt(9999)+1);
		
		//generates random numbers. adds to list and array, and prints out tree
		 MinHeap minHeap = new MinHeap(i);
		 minHeap.insert(5);
		//System.out.println("The Min Heap is ");
		
//				for (int j = 0; j < i-1; j++) {
//					l=rand.nextInt(k);	
//					//System.out.print(l+", ");
//					minHeap.insert(l);
//					
//				}
//			 
//				 while(minHeap.getsize()>0){
//					 if(minHeap.getsize()>=30){
//						 minHeap.print();
//					 }
//					 System.out.println("What would you like to do? 1 for inserting into the tree, 2 to delete the min, 3 to find the min, 4 to generate a random number, and 5 to exit. ");
//					int ans=kbd.nextInt();
//				 int value=(rand.nextInt(15000)+5000);
//				
//				 if(ans==1)	{ //insert key,print
//					 System.out.println("Entering the value "+value+ " into tree.");
//					minHeap.insert(value);
//					
//				 }
//				 else if(ans==2)	{//delete min,print
//					
//						minHeap.remove();
//						System.out.println("Tree has "+minHeap.getsize()+" nodes.");
//					}
//				 else if(ans==3)	{//find min,print
//					 System.out.println("Min value is "+minHeap.min()+".");
//					}
//				
//				 else if(ans==4)	{
//					 int x= rand.nextInt(10000);
//					if(x<=2000){
//						System.out.println("Entering the value "+value+ " into tree.");
//						minHeap.insert(value);
//						//insert key,print
//					}
//					else if(x>2000 &&x<=4000){
//						minHeap.remove();
//						System.out.println("Tree has "+minHeap.getsize()+" nodes.");
//						
//					}
//					else if(x>4000){
//						//find min,print
//						System.out.println("Min value is "+minHeap.min()+".");
//						
//						
//					}
//					
//				}else if(ans==5){
//					break;
//					
//				}
//				else{
//						System.out.println("Incorrect choice.");
//					}
//				}
				 
				
				 minHeap.print();
			       // System.out.println("The Min val is " + minHeap.remove());
			       // System.out.println("The Min val is " + minHeap.min());
				 
			 
			        long end = System.currentTimeMillis();;
			        System.out.println((end - start) + " ms"); 

	               
	        Scanner scan = new Scanner(System.in);
	        /* Creating object of BST */
	        BST bst = new BST(); 
	        System.out.println("Linked List Binary Search Tree Test\n");          
	        char ch;
	       
	              for (int j = 0; j < i-1; j++) {
	      			l=rand.nextInt(k);	
	      			//System.out.print(l+", ");
	      			bst.insert(l);
	      			
	      		}
	        do    
	        {
	            System.out.println("Enter integer element to insert");
	            bst.insert( scan.nextInt() );                     

	            /*  Display tree  */ 
	            System.out.print("\nPost order : ");
	            bst.postorder();
	            System.out.print("\nPre order : "); 
	            bst.preorder();
	            System.out.print("\nIn order : ");
	            bst.inorder();

	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = scan.next().charAt(0);                        
	        } while (ch == 'Y'|| ch == 'y');                    
	    }

}
