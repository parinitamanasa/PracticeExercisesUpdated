package com.stackroute.practice;

import java.util.Collections;
import java.util.List;

public class ReplaceListElements {
    public List<String> replaceList(List<String> list, String tobereplaced, String toreplace){
        Collections.replaceAll(list,tobereplaced,toreplace);
        return list;
    }
    public List<String> remove(List<String> list){
        list.removeAll(list);
        return list;
    }
}
