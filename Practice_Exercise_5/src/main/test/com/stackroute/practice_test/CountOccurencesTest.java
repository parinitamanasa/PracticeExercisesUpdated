package com.stackroute.practice_test;

import com.stackroute.practice.CountOccurences;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class CountOccurencesTest {
    CountOccurences countOccurences;
    @Before
    public void setUp() throws Exception{
        countOccurences = new CountOccurences();
    }
    @Test
    public void countValue() throws Exception{
        Map <String, Integer> expected = new HashMap<String, Integer>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
        System.out.println(expected);
        Map<String, Integer> actual = countOccurences.countingOccurence("one one -one___two,,three,one @three*one?two");
        assertEquals(expected,actual);
    }
    @Test
    public void notCountValue() throws Exception{
        Map <String, Integer> expected = new HashMap<String, Integer>();
        Map<String, Integer> actual = countOccurences.countingOccurence(" ");
        assertEquals(expected,actual);
    }
    @Test
    public void oneCountValue() throws Exception{
        Map <String, Integer> expected = new HashMap<String, Integer>();
        expected.put("one", 1);
        Map<String, Integer> actual = countOccurences.countingOccurence("one");
        assertEquals(expected,actual);
    }
    @Test
    public void countValueWithoutSpecialCharacters() throws Exception{
        Map <String, Integer> expected = new HashMap<String, Integer>();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);
//        System.out.println(expected);
        Map<String, Integer> actual = countOccurences.countingOccurence("one one one two three one three one two");
        assertEquals(expected,actual);
    }
}
