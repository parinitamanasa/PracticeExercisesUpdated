package com.stackroute.practiceExercise;

import java.util.Scanner;

public class RemoveVowels {
    public static String removeVowels(String[] withVowels) {
        String replace;
        int i;
        String toremoveVowels;
        String returnWithoutVowels = "";
        for (i = 0; i < withVowels.length; i++) {
            toremoveVowels = withVowels[i];
            replace = toremoveVowels.replaceAll("[aeiou]", "");
            returnWithoutVowels = returnWithoutVowels + replace + "\n" ;
        }
        return returnWithoutVowels.trim();
    }
}
