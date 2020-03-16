package eg.edu.alexu.csd.filestructure.sort;
import java.util.*;

public class NodeImplementation implements INode {
	
	private Comparable value = null;
	private Integer index = null;
	private ArrayList<INode> a;
	
	public NodeImplementation (ArrayList<INode> A,  Integer index,Comparable value) {
		this.a=A;
		this.value= value;
		this.index= index;
	}

	public INode getLeftChild() {
    	if(a.size()-1 < (index*2) )
    		return null;
    	else
    		return a.get(index*2);
    }

    public INode getRightChild() {
    	if(a.size()-1 < (index*2)+1)
    		return null;
    	else
    		return a.get((index*2)+1);
    }

	public INode getParent() {
    	if(index==1)
    		return null ;
    	return a.get(index/2);
    }

    public Comparable getValue() {
        return value;
    }

	public void setValue(Comparable var1) {
		this.value=var1;
	}





}
