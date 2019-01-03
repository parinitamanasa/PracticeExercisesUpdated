package com.stackroute.practice_test;
import com.stackroute.practice.*;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RegularExpressionTest {
    RegularExpression regularExpression = new RegularExpression();
    @Test
    public void isTrue() throws Exception{
        String expected = "Is Harry here ? true";
        String actual = regularExpression.regularExpressionCheck("This is Harry");
        assertEquals(expected,actual);
    }
    @Test
    public void isFalse() throws Exception{
        String expected = "Is Harry here ? false";
        String actual = regularExpression.regularExpressionCheck("This is Henry");
        assertEquals(expected,actual);
    }
}
