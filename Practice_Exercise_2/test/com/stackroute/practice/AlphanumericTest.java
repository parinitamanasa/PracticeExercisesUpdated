package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphanumericTest {
    @Test
    public void capital() throws Exception{
        String expected="Capital";
        Alphanumeric alphanumeric=new Alphanumeric();
        String actual=alphanumeric.alphanumeric('A');
        assertEquals(expected,actual);
    }
    @Test
    public void lowercase() throws Exception {
        String expected = "Lower case";
        Alphanumeric alphanumeric = new Alphanumeric();
        String actual = alphanumeric.alphanumeric('c');
        assertEquals(expected, actual);
    }
    @Test
    public void specialcharacter() throws Exception {
        String expected = "Special Character";
        Alphanumeric alphanumeric = new Alphanumeric();
        String actual = alphanumeric.alphanumeric('%');
        assertEquals(expected, actual);
    }
}