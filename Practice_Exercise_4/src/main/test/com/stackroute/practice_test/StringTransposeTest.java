package com.stackroute.practice_test;

import com.stackroute.practice.StringTranspose;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StringTransposeTest {
    StringTranspose stringTranspose = new StringTranspose();
    @Test
    public void gettingTranspose() throws Exception{
        String expected = "a kciuq nworb xof spmuj revo eht yzal god";
        String actual = stringTranspose.stringTransposing("a quick brown fox jumps over the lazy dog");
        assertEquals(expected,actual);
    }
}
