package com.stackroute.practice;

public class StringRepeat {
    public String stringrepeat(int n,String str){
        String s="";
        int i,j,k;
        j=str.length();
        for(i=0;i<j;i++)
            s=s+str.charAt(i);
        for(k=0;k<n;k++)
            for(i=j-n;i<j;i++)
            {
                s=s+str.charAt(i);
            }
        return s;
    }
}

