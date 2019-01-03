package com.stackroute.practice;

public class CharacterCount {
    public int characterCounting(String string1, String character){
        String replace="";
        replace = string1.replaceAll(character,"");
        return (string1.length()-replace.length());
    }
}
