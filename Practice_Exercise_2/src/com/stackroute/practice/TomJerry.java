package com.stackroute.practice;

public class TomJerry {
    public String tomjerry(int num){
        if (num % 2 != 0 && num > 20 && num < 30) {
            return "Tom";
        }
        else if (num % 2 == 0 && num > 20 & num < 30) {
            return "Jerry";
        }
        else
            return "-1";
    }
}

