import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Sum {
    public static void main(String args[]) {
        String str;
        int i, sum = 0,j,flag=0;
        System.out.println("Enter the numbers");
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
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
            System.out.println("Sum: "+sum);
        else
            System.out.println("Non Integer values present!");
    }
}
