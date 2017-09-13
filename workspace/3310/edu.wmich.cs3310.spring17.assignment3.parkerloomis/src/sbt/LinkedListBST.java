package sbt;

import java.util.Random;
import java.util.Scanner;

import main.BST;

public class LinkedListBST
{
    public static void main(String[] args)
    {                 
        Scanner scan = new Scanner(System.in);
        /* Creating object of BST */
        BST bst = new BST(); 
        System.out.println("Linked List Binary Search Tree Test\n");          
        char ch;
        /*  Accept input  */
        int i= 100;//number of integers in tree
      		int k= 10000;//max number int node can be
      		int l;
      		Random rand = new Random();
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
