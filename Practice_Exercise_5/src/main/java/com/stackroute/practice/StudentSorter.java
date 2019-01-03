package com.stackroute.practice;

import java.util.Comparator;
import java.util.List;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {

        if(o1.getAge() != o2.getAge()){
            return o1.getAge() - o2.getAge();
        }
        else if(o1.getName().compareTo(o2.getName()) != 0){
            return o1.getName().compareTo(o2.getName());
        }
        else {
            return o1.getId() - o2.getId();
        }
    }
}
