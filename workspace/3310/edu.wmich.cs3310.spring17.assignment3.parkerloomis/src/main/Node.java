package main;

/*
 *  Java Program to Implement a Binary Search Tree using Linked Lists
 */
 
 import java.util.Scanner;

import edu.wmich.cs3310.fall16.labassignment1.Node;    
 
 /* Class Node */
 class Node        
 {
     Node left, right;
     int data;
 
     /* Constructor */
     public Node(int n)
     {
         left = null;
         right = null;
         data = n;
     }  
     public Object getData() {
 		return data;
 	}

 	public void setData(int dataValue) {
 		data = dataValue;
 	}

 	public Node getNext() {
 		return next;
 	}

 	public void setNext(Node nextValue) {
 		next = nextValue;
 	}
 }

