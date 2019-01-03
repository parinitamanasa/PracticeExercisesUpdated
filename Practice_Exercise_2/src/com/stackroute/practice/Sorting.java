package com.stackroute.practice;

public class Sorting {
    public String sorting(int n){
        int  temp, i = 0, sum = 0, j, k;
        int a[] = new int[20];
        String s="";
        temp = n;
        while (temp != 0) {
            a[i] = temp % 10;
            temp = temp / 10;
            if (a[i] % 2 == 0)
                sum = sum + a[i];
            i++;
        }
        for (k = 0; k <= i; k++){
            for (j = k + 1; j <= i; j++) {
                if (a[k] < a[j]) {
                    temp = a[k];
                    a[k] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (j = 0; j < i; j++) {
            s=s+a[j];
        }
        s=s+" "+sum;
        if (sum > 15) {
            s=s+" true";
        }
        else {
            s=s+" false";
        }
        return s;
    }
}

