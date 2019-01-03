package com.stackroute.practiceExercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class Calendar_customTest {
    Calendar_custom calendar_custom = new Calendar_custom();
    @Test
    public void getStartandEndDate() throws Exception{
        String expected = "Mon 24/12/2018" + "\n" + "Sun 30/12/2018";
        String actual = calendar_custom.calendarCustom();
        assertEquals(expected,actual);
    }
}