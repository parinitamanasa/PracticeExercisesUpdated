package com.stackroute.practice_test;

import com.stackroute.practice.*;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReplaceCharacterTest {
    ReplaceCharacter replaceCharacter = new ReplaceCharacter();
    @Test
    public void replaceCharacterTesting() throws Exception{
        String expected = "faity fry";
        String actual = replaceCharacter.replacingCharacter("daily dry");
        assertEquals(expected,actual);
    }
}
