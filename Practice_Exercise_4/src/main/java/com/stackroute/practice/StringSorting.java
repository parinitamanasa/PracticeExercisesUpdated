package com.stackroute.practice;

public class StringSorting {
    public String stringSortCheck(String string1){
        String returnString = "";
        string1 = string1.toLowerCase();
        String[] sorting = string1.split(" ");
        int i,j;
        String temp;
        for(i = 0; i < sorting.length; i++)
        {
            for(j = i+1; j < sorting.length; j++)
            {
                if(sorting[i].compareTo(sorting[j]) > 0)
                {
                    temp=sorting[i];
                    sorting[i]=sorting[j];
                    sorting[j]=temp;
                }
            }
        }
        for(i = 0; i < sorting.length; i++){
            returnString = returnString + " "+ sorting[i];
        }
        return returnString.trim();
    }
}
