package eg.edu.alexu.csd.filestructure.sort;
import java.lang.Comparable;

public interface INode<T extends Comparable<T>> {
	INode<T> getLeftChild();

	INode<T> getRightChild();

	INode<T> getParent();

	Comparable<T> getValue();

    void setValue(Comparable<T> var1);
}
