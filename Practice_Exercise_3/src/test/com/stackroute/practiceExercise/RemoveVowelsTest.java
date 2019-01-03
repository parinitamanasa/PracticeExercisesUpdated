package com.stackroute.practiceExercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    RemoveVowels removeVowels = new RemoveVowels();
    @Test
    public void vowelsremoved() throws Exception{
        String expected = "Ind" + "\n" + "Egypt";
        String[] withVowels = {"India","Egypt"};
        String actual = removeVowels.removeVowels(withVowels);
        assertEquals(expected,actual);
    }
}