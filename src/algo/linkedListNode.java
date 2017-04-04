package algo;

/**
 * Created by Nimrod on 4/4/2017.
 */
public class linkedListNode<T> {
    private linkedListNode _Next;
    private T _Value;

    public linkedListNode getNext() {
        return _Next;
    }

    public void setNext(linkedListNode _Next) {
        this._Next = _Next;
    }

    public T getValue() {
        return _Value;
    }

    public void setValue(T _Value) {
        this._Value = _Value;
    }
}
