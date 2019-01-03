package com.stackroute.practiceExercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers consecutiveNumbers = new ConsecutiveNumbers();
    @Test
    public void areConsecutiveNumbers() throws Exception{
        String expected = "98,97,96,95 are consecutive numbers";
        String actual = consecutiveNumbers.consecutiveNumbers("97,98,95,96");
        assertEquals(expected,actual);
    }
    @Test
    public void areNotConsecutiveNumbers() throws Exception{
        String expected = "98,97,89,86 are not consecutive numbers";
        String actual = consecutiveNumbers.consecutiveNumbers("97,98,89,86");
        assertEquals(expected,actual);
    }
}