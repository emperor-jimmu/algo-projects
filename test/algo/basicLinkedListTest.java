package algo;

/**
 * Created by Nimrod on 4/4/2017.
 */

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class basicLinkedListTest {
    basicLinkedList<String> _List1;

    @Before
    public void setUp() throws Exception {
        _List1 = new basicLinkedList<>();
    }

    @Test
    public void OnInitListIsNull() {
        Assert.assertTrue(_List1._Head == null);
    }

    @Test
    public void AfterInsertionSizeIsOne() {
        _List1.insert(new linkedListNode<>("Nimrod"));

        Assert.assertTrue(_List1.getCount() == 1);
    }

    @Test
    public void AfterInsertionListHasOneElementWithValue() {
        _List1.insert(new linkedListNode<>("Nimrod"));

        Assert.assertTrue(_List1._Head.getValue().equals("Nimrod"));
    }

    @Test
    public void AfterMultipleInsertionsSizeIsThree() {
        _List1.insert(new linkedListNode<>("Nimrod"));
        _List1.insert(new linkedListNode<>("David"));
        _List1.insert(new linkedListNode<>("James"));

        Assert.assertTrue(_List1.getCount() == 3);
    }

    @Test
    public void InsertInEnd() {
        linkedListNode<String> node1 = new linkedListNode<>("Nimrod");
        _List1.insert(node1);
        linkedListNode<String> node2 = new linkedListNode<>("David");
        linkedListNode<String> node3 = new linkedListNode<>("James");
        _List1.insert(node3);

        // Move to James then insert David (will be added at the end)
        linkedListNode<String> headNode = _List1._Head;

        _List1._Head = _List1._Head._Next;
        _List1.insert(node2);

        // Go back to beginning
        _List1._Head = headNode;

        Assert.assertEquals("James", _List1._Head._Next.getValue());
        Assert.assertEquals("David", _List1._Head._Next._Next.getValue());
    }

    @Test
    public void InsertInMiddle() {
        linkedListNode<String> node1 = new linkedListNode<>("Nimrod");
        _List1.insert(node1);
        linkedListNode<String> node2 = new linkedListNode<>("David");
        linkedListNode<String> node3 = new linkedListNode<>("James");
        _List1.insert(node3);

        // Move to James then insert David (will be added at the end)
        linkedListNode<String> headNode = _List1._Head;

        _List1.insert(node2);

        // Go back to beginning
        _List1._Head = headNode;

        Assert.assertEquals("David", _List1._Head._Next.getValue());
        Assert.assertEquals("James", _List1._Head._Next._Next.getValue());
    }
}
