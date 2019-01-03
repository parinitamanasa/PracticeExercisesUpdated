package com.stackroute.practice;

import static java.lang.Integer.parseInt;

public class Sum {
    public String sum(String str){
        int sum=0,j,i,flag=0;
        String[] s = str.split(" ");
        for (i = 0; i < s.length; i++) {
            String ar = s[i];
            for(j=0;j<ar.length();j++)
            {
                if((ar.charAt(j)>='a' && ar.charAt(j)<='z') || (ar.charAt(j)>='A' && ar.charAt(j)<='Z'))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1) {
                break;
            }
            else
                sum=sum+parseInt(s[i]);
        }
        if(flag==0)
            return "Sum: "+sum;
        else
            return "Non Integer values present!";
    }
}
