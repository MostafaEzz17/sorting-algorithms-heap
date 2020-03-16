package eg.edu.alexu.csd.filestructure.sort;

import java.util.ArrayList;

public class mergeSort{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Comparable> arr = new ArrayList<Comparable>() ;
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
		mergeSort s= new mergeSort();
		s.mergeSort(arr);
		System.out.println(arr.toString());		

	}
	
public void mergeSort (ArrayList<Comparable>a) {
		
		if(a.size()==1) {
			return ;
		}
		
		ArrayList<Comparable> sub1 = new ArrayList<Comparable> ();
		ArrayList<Comparable> sub2 = new ArrayList<Comparable> ();

		splitArray(sub1,sub2, a);
		mergeSort(sub1);
		mergeSort(sub2);
		mrgArrays(sub1,sub2,a);
		
	}

	public  void splitArray (ArrayList<Comparable>sub1,ArrayList<Comparable>sub2,ArrayList<Comparable>a) {
		// (a.size()/2)    a.size()-(a.size()/2)
		for(int i=0;i<(a.size()/2);i++)
			sub1.add(a.get(i));
		for(int i=(a.size()/2);i<a.size();i++)
			sub2.add(a.get(i));
	} 
	
	public  void mrgArrays (ArrayList<Comparable>a,ArrayList<Comparable>b,ArrayList<Comparable>mrged) {
			int i=0,j=0,n=0;
		while (i<a.size() && j<b.size() ) {
			if(a.get(i).compareTo( b.get(j)) <= 0) {
				mrged.set(n,a.get(i));
				i++;
			}else {
				mrged.set(n,b.get(j));
				j++;
			} 
			n++;
		}
		if( i == a.size()) {
			while(j<b.size()) {
				mrged.set(n,b.get(j));
				n++;
				j++;
			}
		}
		if( j == b.size()) {
			while(i<a.size()) {
				mrged.set(n,a.get(i));
				n++;
				i++;
			}
		}
		
	}


}
