package com.stackroute.practice;

import java.util.HashMap;
import java.util.Map;

public class MoreNumberOfOccurences {
    public Map<String,Boolean> numberOfOccurences(String[] string1){
        Map<String, Integer> getValues = new HashMap<>();
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        for (String t : string1) {
            if (getValues.containsKey(t)) {
                getValues.put(t, getValues.get(t) + 1);
                if(getValues.get(t) >= 2)
                    map.put(t,true);
            }
            else if(getValues.containsKey(" "));
            else {
                getValues.put(t, 1);
                map.put(t,false);
            }
        }
    return map;
    }
}
