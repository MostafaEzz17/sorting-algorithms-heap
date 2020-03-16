package eg.edu.alexu.csd.filestructure.sort;

import java.util.ArrayList;

public class nottmain {

	public static void main(String[] args) {
		IHeap h = new heapImplementation();
		h.insert(5);
		h.insert(8);
		h.insert(6);
		h.insert(9);
		h.insert(1);
		h.insert(2);
		h.insert(7);
		h.insert(3);
		h.insert(4);
		while( h.size()>0) 
			System.out.println(h.extract());

		 ArrayList<Integer> arr=new ArrayList<Integer>();
	        arr.add(2);
	        arr.add(8);
	        arr.add(14);
	        arr.add(3);
	        arr.add(9);
	        arr.add(1);
	        arr.add(16);
	        arr.add(10);
	        arr.add(4);
	        arr.add(7);
		
		IHeap arrHeap=new heapImplementation();
		arrHeap.build(arr);
		System.out.println(arrHeap.size());
        while( arrHeap.size()>0) {
        	System.out.println(arrHeap.extract());
        
        }
	}
		        
}
