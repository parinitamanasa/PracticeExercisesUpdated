package com.stackroute.practice;

public class Alphanumeric {
    public String alphanumeric(char a){
        if(a>=65 && a<91) {
            return "Capital";
        }
        else if(a>90 && a<117) {
            return "Lower case";
        }
        else {
            return "Special Character";
        }
    }
}
