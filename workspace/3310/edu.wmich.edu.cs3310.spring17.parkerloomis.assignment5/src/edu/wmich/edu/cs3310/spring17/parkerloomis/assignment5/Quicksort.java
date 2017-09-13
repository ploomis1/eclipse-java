package edu.wmich.edu.cs3310.spring17.parkerloomis.assignment5;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class Quicksort {
	
        private static int number;
        static Filearray file;
        
        public static void main(String[] args) throws IOException {
        //BufferPool buff = new BufferPool();
        File filed= new File("testhw5.dat");
       File fill= new File("samplehw5.dat");
       file = new Filearray(filed);
       number = file.getSize(filed);
     
       System.out.println(number);
        	//number= (int) file.getSize();
        	//quicksort(0, number - 1);
       Record rec= file.getRecord(0);
      // rec= file.getRecord(5000);
      // rec= file.getRecord(10000);
     //  rec= file.getRecord(15000);
       rec= file.getRecord(16384);
       System.out.println(rec.key+" "+rec.value);
      
     // file.print(filed);
        	
        	//get size of file
        	//quicksort
        	// find pivot, get lower and upper info from filearray using index
        	//compare, and switch if need be
        	//quicksort again
        }
       
       public static void quicksort(int low, int high) throws IOException {
                int i = low, j = high;
                // Get the pivot element from the middle of the list
              //  int pivot = bites.getShort(low + (high-low)/2);
                int piv =(low + (high-low)/2);
                short pivot = file.getRecord(piv).getKey();
               
                System.out.println(pivot);
                
                while (i <= j) {
                	 
                        while (file.getRecord(i).getKey() < pivot) {
                                i+=4;
                        }
                        
                        while (file.getRecord(j).getKey() > pivot) {
                                j-=4;
                        }

                        if (i <= j) {
                                exchange(i, j);
                                i+=4;
                                j-=4;
                        }
                }
               
               // if (low < j)
                //        quicksort(low, j);
              //  if (i < high)
               //         quicksort(i, high);
                
        }

        private static void exchange(int i, int j) throws IOException {
        
        	//file.SetRecord(i, file.getRecord(i));
        	//file.SetRecord(j, file.getRecord(j));
        	
        }

	
	
	
	
	


    }
    
    //compareTo(ByteBuffer that)
    //Compares this buffer to another.
   // ByteBuffer.compareTo(ByteBuffer that) 
    //use shorts for time

