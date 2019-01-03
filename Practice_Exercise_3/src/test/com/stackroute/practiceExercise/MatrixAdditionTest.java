package com.stackroute.practiceExercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition = new MatrixAddition();
    int[][] matrix1 = {{1,2}, {3,4}};
    int[][] matrix2 = {{4,3}, {2,1}};
    @Test
    public void getsum() throws Exception{
        String expected = "5\t5\n"+ "5\t5";
        String actual = matrixAddition.add(matrix1,matrix2,2,2);
        assertEquals(expected,actual);
    }
}