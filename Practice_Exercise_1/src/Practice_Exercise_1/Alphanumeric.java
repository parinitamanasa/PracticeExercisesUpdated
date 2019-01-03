import java.util.Scanner;

public class Alphanumeric {
    public static void main(String args[])
    {
        char a;
        Scanner character=new Scanner(System.in);
        a=character.next().charAt(0);
        if(a>=65 && a<91) {
            System.out.println("Capital");
        }
        else if(a>90 && a<117) {
            System.out.println("Lower case");
        }
        else {
            System.out.println("Special Character");
        }
    }
}
