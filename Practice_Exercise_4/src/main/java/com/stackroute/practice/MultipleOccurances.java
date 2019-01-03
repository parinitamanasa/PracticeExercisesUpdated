package com.stackroute.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurances {
    public String multipleOccurence(String string1){
        String regex = "se";
        String occurance = "";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string1);
        while(matcher.find()) {
            occurance = occurance + "Found at: " + matcher.start() + " - " + (matcher.start()+2) + "\n";
        }
        return occurance;
    }
}
