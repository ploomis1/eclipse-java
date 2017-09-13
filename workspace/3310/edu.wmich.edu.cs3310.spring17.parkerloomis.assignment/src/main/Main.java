package main;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import sorting.Bubble;
import sorting.BuiltIn;
import sorting.Insertion;
import sorting.Merge;
import sorting.Quick;
import sorting.Selection;

public class Main {
	
	//private List list = new List();


	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		Random rand = new Random();// call random class
		
		Scanner kbd = new Scanner(System.in);
		System.out.println("Please enter the number m from which random numbers will be generated from 1 to m");
		float i = kbd.nextFloat();
		System.out.println("Please enter the number of numbers you want");
		int k = kbd.nextInt();
		kbd.close();
		
//gets user input
		DecimalFormat df = new DecimalFormat("#.000");
		
		float l;
		//float y;
		Object [] array = new Object[k + 1];
//generates random numbers. adds to list and array
		for (int j = 0; j < k; j++) {
			l = rand.nextFloat()*i;
			array[j] = l;
			list.add(l);
		 System.out.print(df.format(l)+" ");
		}
		//Bubble b= new Bubble();
		//b.bubble(list);//doesnt works
		//b.bubble(array);//doesnt works
		//Merge m= new Merge();
		//m.mergeSort(array);//Doesn't work
		//m.merge(list);//Doesn't work
		//Selection s = new Selection();
		//s.selection(list);//Doesn't work
		//s.selectionSort(array);//works
		BuiltIn bi= new BuiltIn();
		bi.In(array);//works
		//bi.In(list);//doesnt work
		//Insertion in=new Insertion();
		//in.sort(array);//works
		//in.sort(list);//doesnt work
		//Quick q = new Quick();
		//q.sort(array);//needs built
		//q.sort(list);//needs built
		
		System.out.print("\n");
		for(int f=0;f<100;f++){
			if(f<k)
			 System.out.print(df.format(array[f])+" ");
			// System.out.print(df.format(list.get(f))+" ");
		}
		
		}
	}
