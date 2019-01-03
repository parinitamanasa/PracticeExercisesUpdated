package com.stackroute.practice;

public class VowelConsonant {
    public String vowelconsonant(String alphabets) {
        int i;
        String s;
        s="";
        for (i = 0; i < alphabets.length(); i++) {
            switch (alphabets.charAt(i)) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    s = s + alphabets.charAt(i) + " -Vowel ";
                    break;
                default:
                    s = s+ alphabets.charAt(i) + " -Consonant ";
                    break;
            }
        }
        return s;
    }
}