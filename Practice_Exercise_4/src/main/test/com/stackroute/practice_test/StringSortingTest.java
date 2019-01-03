package com.stackroute.practice_test;

import com.stackroute.practice.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringSortingTest {
    StringSorting stringSorting = new StringSorting();
    @Test
    public void sortString() throws Exception{
        String expected = "an automated is report test this";
        String actual = stringSorting.stringSortCheck("This is an automated test report");
        assertEquals(expected,actual);
    }
    @Test
    public void sortString1() throws Exception{
        String expected = "a defines expression for or pattern regex regular search strings.";
        String actual = stringSorting.stringSortCheck(" regular expression or regex defines a search pattern for strings.");
        assertEquals(expected,actual);
    }
}
