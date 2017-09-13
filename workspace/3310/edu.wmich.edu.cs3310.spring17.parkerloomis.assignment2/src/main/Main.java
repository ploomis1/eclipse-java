package main;

import java.text.DecimalFormat;
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

	public static void main(String[] args) {
		//LinkedList list = new LinkedList();
		LinkedList<Float> list = new LinkedList<Float>();
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

				float [] array = new float[k + 1];
				float [] array1 = new float[k + 1];
				float [] array2 = new float[k + 1];
				float [] array3 = new float[k + 1];
				float [] array4 = new float[k + 1];
				float [] array5 = new float[k + 1];
				System.out.print("Before sorting: ");
		//generates random numbers. adds to list and array
				for (int j = 0; j < k; j++) {
					l = rand.nextFloat()*i;
					array[j] = l;
					array1[j] = l;
					array2[j] = l;
					array3[j] = l;
					array4[j] = l;
					array5[j] = l;
					list.add(l);
				 System.out.print(df.format(l)+" ");
				}
				System.out.print("\n");
				
				Bubble.bubbleSort(array);
				System.out.print("After Array Bubble Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array[f])+" ");
				}Selection.selectionSort(array2);
				System.out.print("\n");
				System.out.print("After Array Selection Sort: ");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array2[f])+" ");
				}Merge.mergeSort(array3);
				System.out.print("\n");
				System.out.print("After Array Merge Sort: ");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array3[f])+" ");
				}Quick.Sort(array4);
				System.out.print("After Array Quick Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array4[f])+" ");
				}Insertion.sort(array5);
				System.out.print("\n");
				System.out.print("After Array Insertion Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array5[f])+" ");
					
				}BuiltIn.In(array1);
				System.out.print("\n");
				System.out.print("After Array Built-In Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array1[f])+" ");
				}
				Bubble.bubbleSort(array);
				System.out.print("\n");
				System.out.print("After List Bubble Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array[f])+" ");
				}Selection.selectionSort(array2);
				System.out.print("\n");
				System.out.print("After List Selection Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array2[f])+" ");
				}Merge.mergeSort(array3);
				System.out.print("\n");
				System.out.print("After List Merge Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array3[f])+" ");
				}Quick.Sort(array4);
				System.out.print("After List Quick Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array4[f])+" ");
				}Insertion.sort(array5);
				System.out.println();
				System.out.print("After List Insertion Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array5[f])+" ");
					
				}BuiltIn.In(array1);
				System.out.println();
				System.out.print("After List Built-In Sort:");
				for(int f=0;f<100;f++){
					if(f<k)
					 System.out.print(df.format(array1[f])+" ");
				}
	}

}
