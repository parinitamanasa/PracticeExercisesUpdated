import java.util.Scanner;

public class StringReverse {
    public static void main(String args[]){
        String str;
        int i,j;
        char temp;
        Scanner input=new Scanner(System.in);
        str=input.nextLine();
        i=0;
        j=str.length();
       /* while(i<j)
        {
            temp=str.charAt(i);
            str.charAt(i)=str.charAt(j);
            str.charAt(j)=temp;
            i++;
            j--;
        }*/
       for(i=(str.length()-1);i>=0;i--)

        System.out.print(str.charAt(i));
    }
}
