package com.stackroute.practiceExercise;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentDataTest {
    StudentData studentData = new StudentData();
    @Test
    public void displayWithoutError() throws Exception{
        int[] array = {89,98,86,91};
        String expected = "Grade of student 1 is 89" + "\nGrade of student 2 is 98" + "\nGrade of student 3 is 86" + "\nGrade of student 4 is 91";
        String actual = studentData.studentData(array);
        assertEquals(expected,actual);
    }
    @Test
    public void displayWithError() throws Exception{
        int[] array = {120,98,86,49};
        String expected = "Error! Grade is not in range..It should be between 0 and 100" + "\nGrade of student 2 is 98" + "\nGrade of student 3 is 86" + "\nGrade of student 4 is 49";
        String actual = studentData.studentData(array);
        assertEquals(expected,actual);
    }
}