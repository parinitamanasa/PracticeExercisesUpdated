package com.stackroute.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public List<Student> studentData(List<Student> list) {
        if(list.isEmpty()){
            return list;
        }
        Collections.sort(list, new StudentSorter().reversed());
        return list;
    }
//    public static void main(String[] args) {
//        List<Student> list = new ArrayList<Student>();
//        Student student = new Student();
//        student.setId(1);
//        student.setName("Manasa");
//        student.setAge(22);
//        list.add(student);
//
//        Student student1 =new Student();
//        student1.setId(2);
//        student1.setName("Ujjwala");
//        student1.setAge(25);
//        list.add(student1);
//
//        Student student2 =new Student();
//        student2.setId(5);
//        student2.setName("Maanu");
//        student2.setAge(27);
//        list.add(student2);
//
//        Student student3 =new Student();
//        student3.setId(4);
//        student3.setName("Kavya");
//        student3.setAge(23);
//        list.add(student3);
//
//        Student student4 =new Student();
//        student4.setId(3);
//        student4.setName("Keerthy");
//        student4.setAge(25);
//        list.add(student4);
//
//        Collections.sort(list, new StudentSorter().reversed());
//        for(Student a : list){
//            System.out.println(a.getId() + "\t" + a.getName() + "\t" + a.getAge() );
//        }
//    }

}
