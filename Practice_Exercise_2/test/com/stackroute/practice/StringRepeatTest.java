package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringRepeatTest {
    @Test
    public void repeat_5times() throws Exception{
        String expected="Stackrouterouterouterouterouteroute";
        StringRepeat stringRepeat=new StringRepeat();
        String actual=stringRepeat.stringrepeat(5,"Stackroute");
        assertEquals(expected,actual);
    }

}