package com.stackroute.practice;

public class Guess_number {
    public String guess(int num){
        int i,x=23;
        String str="";
        while(true){
            if(num>x)
                System.out.println("Greater than the target");
            else if(num<x)
                System.out.println("Lesser than the target");
            else if(num==x){
                str=str+"Matches the target";
                break;
            }
        }
        return str;
    }
}
