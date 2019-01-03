package com.stackroute.practiceExercise;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsecutiveNumbers {
    public String consecutiveNumbers(String numbers){
        String temp;
        String returnResult = "";
        int i,j;
        boolean flag = false;
        String[] numbers1 = numbers.split(",");
        for(i = 0; i < numbers1.length; i++){
            for (j = i + 1; j < numbers1.length; j++) {
                if ((Integer.parseInt(numbers1[i])) < (Integer.parseInt(numbers1[j]))) {
                    temp = numbers1[i];
                    numbers1[i] = numbers1[j];
                    numbers1[j] = temp;
                }
            }
        }
        for(i = 0; i < numbers1.length-1; i++){
            if((Integer.parseInt(numbers1[i]))-(Integer.parseInt(numbers1[i+1])) == 1){
                flag = true;
            }
            else
                flag = false;
        }
        for(i = 0; i < numbers1.length; i++){
            if(i == numbers1.length-1){
                returnResult = returnResult+numbers1[i];
                break;
            }
            returnResult = returnResult + numbers1[i]+ ",";
        }
        if(flag){
            returnResult = returnResult+" are consecutive numbers";
        }
        else{
            returnResult = returnResult + " are not consecutive numbers";
        }
        return returnResult;
    }
}
