package com.stackroute.practice;

public class ReplaceCharacter {
    public String replacingCharacter(String string1){
        String replace;
        replace = string1.replaceAll("l","t");
        replace = replace.replaceAll("d","f");
        return replace;
    }
}
