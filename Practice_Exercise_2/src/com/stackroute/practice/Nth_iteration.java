package com.stackroute.practice;

public class Nth_iteration {
    public String nth_iteration(int n){
        int i,j;
        String s="";
        for(i=1;i<=n;i++)
            for(j=1;j<=i;j++)
            {
                s=s+Integer.toString(i);
            }
        return s;
    }
}
