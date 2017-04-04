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
        Assert.assertTrue(_List1.getList() == null);
    }

    @Test
    public void AfterInsertionSizeIsOne() {
        _List1.insert(new linkedListNode<>("Nimrod"));

        Assert.assertTrue(_List1.getCount() == 1);
    }

    @Test
    public void AfterInsertionListHasOneElementWithValue() {
        _List1.insert(new linkedListNode<>("Nimrod"));

        Assert.assertTrue(_List1.getList().getValue().equals("Nimrod"));
    }

}
