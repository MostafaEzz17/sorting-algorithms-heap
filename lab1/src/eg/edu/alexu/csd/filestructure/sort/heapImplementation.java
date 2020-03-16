package eg.edu.alexu.csd.filestructure.sort;

import java.util.Collection;
import java.util.ArrayList;

public  class heapImplementation implements IHeap {
	
	private ArrayList<INode> a = new ArrayList<INode>() ;
	private int heapLength=0;

    public INode getRoot() {
    	if(heapLength > 0)
    		return a.get(1);
        return null;
    }

    public int size() {
        return heapLength;
    }
    
    private void swap(INode var1, INode var2) {
    	Comparable temp =  var1.getValue();
		var1.setValue(var2.getValue());
		var2.setValue(temp);
    }

    public void heapify(INode var1) {
    	if(var1==null)
    		return;
    	INode largest= var1;
    	if(var1.getLeftChild() != null && var1.getLeftChild().getValue().compareTo(largest.getValue())>0)
    		largest=var1.getLeftChild();
    	if(var1.getRightChild() != null && var1.getRightChild().getValue().compareTo(largest.getValue())>0)
    		largest=var1.getRightChild();
    	if(largest.getValue().compareTo(var1.getValue()) != 0 ) {
    		swap(var1,largest);
    		heapify(largest);
    	}

    }
 
    public Comparable extract() {
    	if(getRoot() != null) {
    		
    		Comparable max=getRoot().getValue();
    		swap(getRoot(),a.get(heapLength));
    		a.remove(heapLength);
    		heapLength--;
    		if(heapLength>0)
    			heapify(getRoot());
    		return max;
    	}
    	return null;
    }

    private void invHeapify(INode var1){
		if(var1.getParent() != null) {
			if(var1.getValue().compareTo(var1.getParent().getValue())>0 ) {
				swap(var1, var1.getParent());
				invHeapify(var1.getParent());
			}
		}
    }
	
    public void insert(Comparable var1) {
    	if(var1==null)
    		return;
    	if(a.size()==0 ) {
    		a.add(new NodeImplementation(a,0,-1));
    	}
    	heapLength++;
    	a.add(new NodeImplementation(a, heapLength ,var1));
    	invHeapify(a.get(heapLength));
    }

	public void build(Collection var1) {
		if(var1 == null)
			return;
    	ArrayList<Comparable> temp= (ArrayList<Comparable>)var1;
    	
		a.add(new NodeImplementation(a,0,null));
		
    	for (int i= 0; i <var1.size() ; i++ ) {
    		heapLength++;
        	a.add(new NodeImplementation(a, heapLength ,temp.get(i)));
		}
    	for (int i= heapLength/2; i >0 ; i-- ) 
    		heapify(a.get(i));
    }
}
