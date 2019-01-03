package com.stackroute.practice_test;

import org.junit.Before;
import org.junit.Test;
import com.stackroute.practice.*;
import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ReplaceListElementsTest {
    ReplaceListElements replaceListElements;
    @Before
    public void setUp() throws Exception{
        replaceListElements = new ReplaceListElements();
    }
    @Test
    public void replaceElements() throws Exception{
        
        ArrayList<String> expected= new ArrayList<String>(Arrays.asList(new String[]{"Kiwi", "Grape", "Mango","Berry"}));

         ArrayList<String> list= new ArrayList<String>(Arrays.asList(new String[]{"Apple", "Grape","Mango","Berry"}));

        List<String> actual = replaceListElements.replaceList(list, "Apple", "Kiwi");
        assertEquals(expected,actual);
        List<String> listRemove = new ArrayList<String>();
        assertEquals(listRemove,replaceListElements.remove(list));
    }
    @Test
    public void replaceElements1() throws Exception{
        List<String> expected =new ArrayList<>();
        expected.add("Apple");
        expected.add("Grape");
        expected.add("Melon");
        expected.add("Berry");
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Grape");
        list.add("Mango");
        list.add("Berry");
        List<String> actual = replaceListElements.replaceList(list, "Mango", "Melon");
        assertEquals(expected,actual);
        List<String> listRemove = new ArrayList<String>();
        assertEquals(listRemove,replaceListElements.remove(list));
    }
    @Test
    public void nullArray() throws Exception{
        ArrayList<String> expected= new ArrayList<String>();

        ArrayList<String> list = new ArrayList<String>();

        List<String> actual = replaceListElements.replaceList(list, "Mango", "Melon");
        assertEquals(expected,actual);
    }
}
