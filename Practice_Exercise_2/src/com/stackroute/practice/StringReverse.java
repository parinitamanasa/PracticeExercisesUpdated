package com.stackroute.practice;

public class StringReverse {
    public String reverse(String str){
        int i;
        String s="";
        for(i=(str.length()-1);i>=0;i--)
            s=s+str.charAt(i);
        return s;
    }
}
