package com.stackroute.practice_test;

import com.stackroute.practice.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CharacterCountTest {
    CharacterCount characterCount = new CharacterCount();
    @Test
    public void characterCounting() throws Exception{
        int expected = 1;
        int actual = characterCount.characterCounting("stackroute", "a");
        assertEquals(expected,actual);
    }
    @Test
    public void characterCounting1() throws Exception{
        int expected = 3;
        int actual = characterCount.characterCounting("manasa", "a");
        assertEquals(expected,actual);
    }
    @Test
    public void characterCounting2() throws Exception{
        int expected = 2;
        int actual = characterCount.characterCounting("character", "r");
        assertEquals(expected,actual);
    }
    @Test
    public void charactercount3() throws Exception{
        int expected = 0;
        int actual = characterCount.characterCount("manasa", "b");
        assertEquals(expected,actual);
    }
}
