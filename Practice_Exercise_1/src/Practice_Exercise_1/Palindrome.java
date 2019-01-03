import java.util.Scanner;

public class Palindrome {
public static void main (String args[])
{
    int num,rev=0,temp,i,sum=0,rev1;
    System.out.println("Enter a number");
    Scanner number = new Scanner(System.in);
    num = number.nextInt();
    temp = num;
    while(temp!=0)
    {
        rev = temp%10 + rev*10;
            temp = temp / 10;
    }
    while(temp!=0)
    {
        rev=temp%10;
        sum=sum+rev;
        temp=temp/10;
    }
    if(num == rev){
        if(sum>25)
        System.out.println(num + " is a palindrome and is greater than 25");
        else
            System.out.println(num + " is a palindrome and is less than 25");
    }
    else
        System.out.println(num + "is not a palindrome");
}
}
