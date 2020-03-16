package eg.edu.alexu.csd.filestructure.sort;

import java.util.ArrayList;

public class bubbleSort<T> {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>() ;
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
	
		System.out.println(arr.toString());
		bubbleSort s= new bubbleSort(arr);
		System.out.println(arr.toString());		

	}
	

	public  bubbleSort(ArrayList<Comparable<T>> a ) {
		boolean flagSwap = true ;
		for(int i=0 ; i< a.size()-1 && flagSwap ; i++ ) {
			flagSwap = false ;
			for(int j = 0 ; j < a.size()-i-1 ; j++) {
				if(a.get(j).compareTo((T) a.get(j+1))> 0 ) {
					Comparable<T> temp = a.get(j+1);
					a.set(j+1, a.get(j)) ;
					a.set(j, temp);
					flagSwap= true ;
				}	
			}
		}
	}
}
