package eg.edu.alexu.csd.filestructure.sort;

import java.util.ArrayList;

public  class SortImplementation implements ISort {

	public IHeap heapSort(ArrayList unordered) {
		// TODO Auto-generated method stub
		IHeap h=new heapImplementation();
		if(unordered== null) 
			return h;
		h.build(unordered);
		while(h.size()>0) {
			h.extract();
		}
		return h;
		
			
		
	}

	public void sortSlow(ArrayList unordered) {
		// TODO Auto-generated method stub
		if (unordered == null)
			return;
		bubbleSort bs = new bubbleSort(unordered);
	}

	public void sortFast(ArrayList unordered) {
		// TODO Auto-generated method stub
		if (unordered == null)
			return;
		if (unordered.size() == 0)
			return;
		mergeSort ms= new mergeSort();
		ms.mergeSort(unordered);
	}

}
