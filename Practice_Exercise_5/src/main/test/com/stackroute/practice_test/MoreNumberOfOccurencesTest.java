package com.stackroute.practice_test;

import com.stackroute.practice.*;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class MoreNumberOfOccurencesTest {

    MoreNumberOfOccurences moreNumberOfOccurences;
    @Before
    public void setUp() throws Exception{
        moreNumberOfOccurences = new MoreNumberOfOccurences();
    }
    @Test
    public void countNumberOfOccurences() throws Exception{
        Map<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);
        String[] arr = {"a","b","c","d","a","c","c"};
        Map<String, Boolean> actual = moreNumberOfOccurences.numberOfOccurences(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void nomoreNumberOfOccurences() throws Exception{
        Map<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put("a",false);
        expected.put("b",false);
        expected.put("c",false);
        expected.put("d",false);
        String[] arr = {"a","b","c","d"};
        Map<String, Boolean> actual = moreNumberOfOccurences.numberOfOccurences(arr);
        assertEquals(expected,actual);
    }
    @Test
    public void noelements() throws Exception {
        Map<String, Boolean> expected = new HashMap<String, Boolean>();
        String[] arr = {};
        Map<String, Boolean> actual = moreNumberOfOccurences.numberOfOccurences(arr);
        assertEquals(expected, actual);
    }
    }
