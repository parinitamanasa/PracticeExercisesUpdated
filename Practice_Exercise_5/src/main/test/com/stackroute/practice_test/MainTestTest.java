package com.stackroute.practice_test;

import com.stackroute.practice.MainTest;
import com.stackroute.practice.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class MainTestTest {
    List<Student> list;
    MainTest mainTest;
    @Before
    public void setUp() throws Exception{
        list = new ArrayList<Student>();
        mainTest = new MainTest();
    }
    @Test
    public void studentDataTesting() throws Exception{
        List<Student> list = new ArrayList<Student>();
        Student student = new Student();
        student.setId(1);
        student.setName("Manasa");
        student.setAge(22);
        list.add(student);

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("Ujjwala");
        student1.setAge(25);
        list.add(student1);

        Student student2 = new Student();
        student2.setId(5);
        student2.setName("Maanu");
        student2.setAge(27);
        list.add(student2);

        Student student3 = new Student();
        student3.setId(4);
        student3.setName("Kavya");
        student3.setAge(23);
        list.add(student3);

        Student student4 = new Student();
        student4.setId(3);
        student4.setName("Keerthy");
        student4.setAge(25);
        list.add(student4);
        List<Student> actual = mainTest.studentData(list);
        List<Student> expected = new ArrayList<Student>();

        expected.add(student2);
        expected.add(student1);
        expected.add(student4);
        expected.add(student3);
        expected.add(student);

        assertEquals(expected, actual);
    }
    @Test
    public void nullCaseHandling() throws Exception{
        List<Student> expected = new ArrayList<Student>();
        List<Student> list = new ArrayList<Student>();
        List<Student> actual = mainTest.studentData(list);

        assertEquals(expected, actual);
    }
}
