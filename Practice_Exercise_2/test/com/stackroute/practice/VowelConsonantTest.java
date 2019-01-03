package com.stackroute.practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    @Test
    public void vowelconsonanttetsing_twocharacters() throws Exception{
        String expected="m -Consonant a -Vowel ";
        VowelConsonant vowelConsonant=new VowelConsonant();
        String actual=vowelConsonant.vowelconsonant("ma");
        assertEquals(expected,actual);
    }
    @Test
    public void vowelconsonanttesting() throws Exception{
        String expected="m -Consonant a -Vowel n -Consonant a -Vowel s -Consonant a -Vowel ";
        VowelConsonant vowelConsonant=new VowelConsonant();
        String actual=vowelConsonant.vowelconsonant("manasa");
        assertEquals(expected,actual);
    }

}