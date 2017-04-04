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
    public void OnInitListIsInitialized() {
        Assert.assertTrue(_List1.getList() != null);
    }

    @Test
    public void OnInitNextIsNull() {

        Assert.assertTrue(_List1.getList().getNext() == null);
    }

}
