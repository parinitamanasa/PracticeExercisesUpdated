package com.stackroute.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public String regularExpressionCheck(String string1){
        String returnString = "";
        String regex = ".*Harry.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(string1);
        if(m.find()){
            returnString = "Is Harry here ? true";
        }
        else{
            returnString = "Is Harry here ? false";
        }
        return returnString;
    }
}
