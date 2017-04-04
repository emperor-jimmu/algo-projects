package algo;

/**
 * Created by Nimrod on 4/4/2017.
 */
public class basicLinkedList<T> {
    private linkedListNode<T> _Head = null;

    private int count = 0;

    public linkedListNode<T> getList() {
        return _Head;
    }

    public int getCount() {
        return count;
    }

    public void insert(linkedListNode<T> node) {
        // Case 1. List is empty
        if (_Head == null) {
            _Head = node;
        }

        // Case 2. One item in list (or end of list)
        else if (_Head._Next == null) {
            _Head._Next = node;
        }

        // Case 3. Insert in middle of list
        else {
            // Set the right node
            linkedListNode<T> oldRightNode = new linkedListNode<>((T) _Head._Next.getValue());
            oldRightNode._Next = _Head._Next;

            // Set the left node to connect to the middle node
            _Head._Next = node;

            // Connect middle to right node
            node._Next = oldRightNode;
        }

        // Increment elements counter
        count++;
    }
}
