package com.stackroute.practice_test;

import com.stackroute.practice.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MultipleOccurancesTest {
    MultipleOccurances multipleOccurances = new MultipleOccurances();
    @Test
    public void multipleOccurenceTesting() throws Exception{
        String expected = "Found at: 4 - 6" + "\nFound at: 10 - 12" + "\nFound at: 28 - 30\n";
        String actual = multipleOccurances.multipleOccurence("She sells sea shells on the sea shore");
        assertEquals(expected,actual);
    }
}
