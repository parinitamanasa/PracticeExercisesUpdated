package com.stackroute.practiceExercise;

import java.util.Scanner;

public class StudentData {

    public String studentData(int[] num)
    {
        int i,n;
        n = num.length;
        String returnStudentdata = "";
        for (i =0; i < n; i++){
            if(num[i] < 0 || num[i]>100){
                returnStudentdata = returnStudentdata + "Error! Grade is not in range..It should be between 0 and 100\n";
            }
            else
            {
                returnStudentdata = returnStudentdata+"Grade of student " + (i+1) + " is " + num[i] +"\n";
            }
        }
        return returnStudentdata.trim();
    }
}
