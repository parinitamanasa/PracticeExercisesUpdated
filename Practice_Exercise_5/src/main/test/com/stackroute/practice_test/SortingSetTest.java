package com.stackroute.practice_test;

import com.stackroute.practice.*;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;

public class SortingSetTest {
        SortingSet sortingSet;
        @Before
        public void setUp() throws Exception{
                sortingSet = new SortingSet();
        }
         @Test
        public void sortingSets() throws Exception{
                    List<String> expected = new ArrayList<>();
                    expected.add("Alice");
                    expected.add("Bluto");
                    expected.add("Eugene");
                    expected.add("Harry");
                    expected.add("Olive");
                    Set<String> toSend = new HashSet<>();
                    toSend.add("Harry");
                    toSend.add("Olive");
                    toSend.add("Alice");
                    toSend.add("Bluto");
                    toSend.add("Eugene");
                    List<String> actual = sortingSet.sortingSetCheck(toSend);
                    assertEquals(expected,actual);
         }
        @Test
        public void sortingSets1() throws Exception{
                List<String> expected = new ArrayList<>();
                expected.add("Mars");
                expected.add("Mercury");
                expected.add("Neptune");
                expected.add("Pluto");
                expected.add("Saturn");
                Set<String> toSend = new HashSet<>();
                toSend.add("Mercury");
                toSend.add("Saturn");
                toSend.add("Mars");
                toSend.add("Pluto");
                toSend.add("Neptune");
                List<String> actual = sortingSet.sortingSetCheck(toSend);
                assertEquals(expected,actual);

        }
        @Test
        public void sortingOneElementSet() throws Exception {
                List<String> expected = new ArrayList<>();
                expected.add("Mars");
                Set<String> toSend = new HashSet<>();
                toSend.add("Mars");
                List<String> actual = sortingSet.sortingSetCheck(toSend);
                assertEquals(expected, actual);
        }
        @Test
        public void sortingNoElementSet() throws Exception {
                List<String> expected = new ArrayList<>();
                Set<String> toSend = new HashSet<>();
                List<String> actual = sortingSet.sortingSetCheck(toSend);
                assertEquals(expected, actual);
	}
}
