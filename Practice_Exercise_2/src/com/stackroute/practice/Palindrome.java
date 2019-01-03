package com.stackroute.practice;

public class Palindrome {
    public static void main(String args[]){

    }
    public String palindrome(int num) {
        int temp, rev=0, sum = 0;
        temp = num;
        while (temp != 0) {
            rev = temp % 10 + rev * 10;
            temp = temp / 10;
        }
        if (num == rev) {
                temp=num;
                rev=0;
                while (temp != 0) {
                    rev = temp % 10;
                    sum = sum + rev;
                    temp = temp / 10;
                }
            if (sum > 25)
                return num + " is a palindrome and is greater than 25";
            else
                return num + " is a palindrome and is less than 25";
        }
        else
            return num + " is not a palindrome";
    }
}

