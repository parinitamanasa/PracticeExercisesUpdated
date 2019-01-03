import java.util.Scanner;

public class Guess_number {
    public static void main(String args[])
    {
        int n,i,x=23;
        System.out.println("Enter a number");
        Scanner input=new Scanner(System.in);
        while(true)
        {
            n=input.nextInt();
            if(n>x)
                System.out.println("Greater than the target");
            else if(n<x)
                System.out.println("Lesser than the target");
            else if(n==x){
                System.out.println("Matches the target");
                break;
            }
        }
    }
}
