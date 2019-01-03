package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;
public class SumTest {
    @Test
    public void sumof4elements() throws Exception{
        String expected="Sum: 41";
        Sum sum=new Sum();
        String actual=sum.sum("12 23 2 4");
        assertEquals(expected,actual);
    }
}