package algo;

/**
 * Created by Nimrod on 4/4/2017.
 */
public class linkedListNode<T> {
    public linkedListNode _Next = null;

    private T _Value;

    public linkedListNode(T value) {
        this._Value = value;
    }

    public T getValue() {
        return _Value;
    }

    public void setValue(T _Value) {
        this._Value = _Value;
    }
}
