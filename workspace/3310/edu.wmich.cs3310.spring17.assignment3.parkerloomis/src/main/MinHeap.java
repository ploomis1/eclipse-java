package main;

public class MinHeap {

	private int[] Heap;
    private int size;
    private int maxsize;
 
    private static final int FRONT = 1;
 
    public MinHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }
 
    private int parent(int pos)
    {
        return pos / 2;
    }
 
    private int leftChild(int pos)
    {
        return (2 * pos);
    }
 
    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }
 
    private boolean isLeaf(int pos)
    {
        if (pos >=  (size / 2)  &&  pos <= size)
        { 
            return true;
        }
        return false;
    }
 
    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }
 
    private void minHeapify(int pos)
    {
        if (!isLeaf(pos))
        { 
            if ( Heap[pos] > Heap[leftChild(pos)]  || Heap[pos] > Heap[rightChild(pos)])
            {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)])
                {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }else
                {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }
 
    public void insert(int element)
    {
    	 if(size==maxsize){
         	expand();
         }
        Heap[++size] = element;
        int current = size;
       
        while (Heap[current] < Heap[parent(current)])
        {
            swap(current,parent(current));
            current = parent(current);
        }	
    }
    public void expand(){
    	 int [] newArray = new int [Heap.length + 1];
    	   //System.arraycopy(Heap, 0, newArray, 0, Heap.length);

    	  // an alternative to using System.arraycopy would be a for-loop:
    	    for(int i = 0; i < this.Heap.length; i++)
    	        newArray[i] = this.Heap[i];
    	 this.Heap = newArray;
    	 this.maxsize++;
    }
 
    public void print()
    {
       for (int i = 1; i <= size; i++ )
        {
          // System.out.print(" PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2*i] 
           //   + " RIGHT CHILD :" + Heap[2 * i  + 1]);
           System.out.print(Heap[i]+", ");
        } 
       System.out.print("\n");
    }
 
    public void minHeap()
    {
        for (int pos = (size / 2); pos >= 1 ; pos--)
        {
            minHeapify(pos);
        }
    }
 
    public int remove()
    {
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--]; 
        minHeapify(FRONT);
        return popped;
    }
    public int min()
    {
    	int popped = Heap[FRONT];
        minHeapify(FRONT);
        return popped;
    }
    public int getsize(){
    	return size;
    }
 
   

}
