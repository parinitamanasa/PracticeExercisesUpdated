package com.stackroute.practice;

public class StringTranspose {
    public String stringTransposing(String string1) {
        String[] splitString = string1.split(" ");
        String reversedString = "";
        int i, j;
        for (i = 0; i < splitString.length; i++) {
            String word = splitString[i];
            String reverseWord = "";
            for (j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        return reversedString.trim();
    }
}
