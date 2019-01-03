package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringReverseTest {
    @Test
    public void reverse_london() throws Exception{
        String expected="nodnol";
        StringReverse stringReverse=new StringReverse();
        String actual=stringReverse.reverse("london");
        assertEquals(expected,actual);
    }
    @Test
    public void reverse_madam() throws Exception{
        String expected="madam";
        StringReverse stringReverse=new StringReverse();
        String actual=stringReverse.reverse("madam");
        assertEquals(expected,actual);
    }
}