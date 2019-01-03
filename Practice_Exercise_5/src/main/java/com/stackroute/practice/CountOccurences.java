package com.stackroute.practice;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {
    public Map<String, Integer> countingOccurence(String string1){

         //one one -one___two,,three,one @three*one?two”
        String str1 = string1.replaceAll("[\\-@___\\*\\?,,]"," ");
        String[] splitString = str1.split(" ");

        for (String data:splitString) {

            System.out.println("data after split" + data);
        }

        Map<String, Integer> getValues = new HashMap<>();
        for (String t : splitString) {
            int count = 0;
            for(String st : splitString){
                if(t.equals(st) && t.matches("[a-zA-Z0-9]+")){
                    count++;
                }
            }
            if(count != 0) {
                getValues.put(t, count);
            }
        }
//        getValues.remove("");
//        if(getValues.isEmpty()){
//            return null;
//        }
        System.out.println("data is "+getValues);
        return getValues;
    }
}
