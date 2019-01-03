package com.stackroute.practice;

import java.util.Map;
import java.util.Set;

public class ShiftingValues {
    public Map<String, String> shifValuesOneAheadOfOther(Map<String, String> shiftValue){
        if(shiftValue.isEmpty()){
            return null;
        }
        String temp;
        String key;
        String temp1;
        Map.Entry<String,String> entry = shiftValue.entrySet().iterator().next();
        key = entry.getKey();
        temp = entry.getValue();
        shiftValue.put(key, " ");
        for(Map.Entry<String, String> entry1 : shiftValue.entrySet()){
            if(!entry1.getKey().equals(key)){
             temp1 = entry1.getValue();
             shiftValue.put(entry1.getKey(), temp);
             temp = temp1;
            }
        }
//        System.out.println(shiftValue);
        return shiftValue;
    }
}
