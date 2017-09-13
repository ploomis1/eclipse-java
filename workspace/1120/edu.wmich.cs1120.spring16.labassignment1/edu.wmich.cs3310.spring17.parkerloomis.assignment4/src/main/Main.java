package main;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Random rand = new Random();// call random class
		
		//Scanner kbd = new Scanner(System.in);
		
		//kbd.close();
		int i= 19;//max number int node can be
		int k= 100;//number of integers in tree
		int l;
		//int key=5;
		int count=0;
		/*
		 * need to loop 20 times
		 * in loops you need to print counts, sum of counts, and the difference between them
		 */
		
       System.out.print("This tree implements heap.");          
      //  char ch;
       while(count<20){
    	   BSTS bst = new BSTS(k); 
       System.out.print("\n");
              for (int j = 0; j < k; j++) {
      			l=(rand.nextInt(i))+1;	
      			//System.out.println(l+", "+(bst.getCount(l)));
      			bst.insert(l,(bst.getCount(l)));
      			
      		}
              bst.print();
              System.out.println("Sum of Keys "+bst.sumKeys()+" Sum of count "+bst.sumCount());
             
              //System.out.println(bst.sumKeys()+"    count "+bst.sumCount());
              int h=bst.getCount(1);
              int f=bst.sumKeys();
              int d=bst.sumCount();
              int q=0;
              do{
              	d+=1;
              	//h+=1;
              	q++;
              }while((f-d)!=0);
              	//int f=bst.sumKeys()-bst.sumCount();
              	//int h=bst.getCount(1);
              	
              	System.out.println("You would have to add 1, "+(q-h)+" times to make the sums even.");
              
      count++; }
              

       /*
		 * need to print out in preorder, postorder, and inorder
		 *  (keyVal, repeatCount, sizeOfSubtree,subtreeHeight) 
		 */
       
	}
	

}
