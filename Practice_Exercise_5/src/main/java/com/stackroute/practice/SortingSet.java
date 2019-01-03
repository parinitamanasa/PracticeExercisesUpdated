package com.stackroute.practice;

import java.util.*;

public class SortingSet {
    public List<String> sortingSetCheck(Set<String> treeSet){
        Set<String> sorted = new TreeSet<String>(treeSet);
        System.out.println(sorted);
        List<String> list = new ArrayList<String>();
        Iterator<String> ascSorting = sorted.iterator();
        while(ascSorting.hasNext()) {
            list.add(ascSorting.next());
        }
        return list;
    }
}
