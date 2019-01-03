import java.util.Scanner;

public class nth_iteration {
    public static void main(String args[]){
        int n,i,j;
        System.out.println("Enter a number");
        Scanner number=new Scanner(System.in);
        n = number.nextInt();
        for(i=1;i<=n;i++)
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
    }
}
