package com.stackroute.practice_test;

import org.junit.Before;
import org.junit.Test;
import com.stackroute.practice.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static junit.framework.Assert.assertNull;
import static junit.framework.TestCase.assertEquals;

public class ShiftingValuesTest {
    ShiftingValues shiftingValues;
    @Before
    public void setUp() throws Exception{
        shiftingValues = new ShiftingValues();
    }
    @Test
    public void shiftedValues() throws Exception{
        Map<String, String> expected = new LinkedHashMap<>();
        expected.put("val1", " ");
        expected.put("val2", "java");
        expected.put("val3", "c++");
        Map<String, String> toSend = new LinkedHashMap<>();
        toSend.put("val1", "java");
        toSend.put("val2", "c++");
        toSend.put("val3", "c");
        Map<String, String> actual;
        actual = shiftingValues.shifValuesOneAheadOfOther(toSend);
        assertEquals(expected, actual);
    }
    @Test
    public void shiftedValues1() throws Exception{
        Map<String, String> expected = new LinkedHashMap<>();
        expected.put("val1", " ");
        expected.put("val2", "java");
        expected.put("val3", "c++");
        expected.put("val4", "c");
        expected.put("val5", "Scala");
        Map<String, String> toSend = new LinkedHashMap<>();
        toSend.put("val1", "java");
        toSend.put("val2", "c++");
        toSend.put("val3", "c");
        toSend.put("val4", "Scala");
        toSend.put("val5", "Python");
        Map<String, String> actual;
        actual = shiftingValues.shifValuesOneAheadOfOther(toSend);
        assertEquals(expected, actual);
    }
    @Test
    public void shiftingOneValue() throws Exception{
        Map<String, String> expected = new LinkedHashMap<>();
        expected.put("val1", " ");
        Map<String, String> toSend = new LinkedHashMap<>();
        toSend.put("val1", "java");
        Map<String, String> actual = shiftingValues.shifValuesOneAheadOfOther(toSend);
        assertEquals(expected, actual);
    }
    @Test
    public void shiftingNoValue() throws Exception{
        Map<String, String> expected = new LinkedHashMap<>();
        Map<String, String> toSend = new LinkedHashMap<>();
        Map<String, String> actual = shiftingValues.shifValuesOneAheadOfOther(toSend);
        assertNull("Testing for null cases failed", actual);
    }
}
