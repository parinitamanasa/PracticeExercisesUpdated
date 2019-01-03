import java.util.Scanner;

public class StringRepeat_n {
    public static void main(String args[])
    {
        String str;
        int n,i,j,k;
        System.out.println("Enter the iterations");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println("Enter the string to be repeated");
        str=input.nextLine();
        System.out.println(str);
        j=str.length();
        for(i=0;i<j;i++)
            System.out.print(str.charAt(i));
        for(k=0;k<n;k++)
        for(i=j-n;i<j;i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}
