package algo;

/**
 * Created by Nimrod on 4/4/2017.
 */
public class basicLinkedList<T> {
    private linkedListNode<T> _List;

    public basicLinkedList() {
        this._List = new linkedListNode<>();
    }

    public linkedListNode<T> getList() {
        return _List;
    }
}
