import java.util.Scanner;

public class Vowelconsonant {
    public static void main(String args[])
    {
        int i;
        String alphabets;
        System.out.println("Enter a string");
        Scanner string = new Scanner(System.in);
        alphabets = string.nextLine();
        for (i=0;i<alphabets.length();i++)
        {
            switch (alphabets.charAt(i))
            {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.println(alphabets.charAt(i) + "-Vowel"); break;
                default: System.out.println(alphabets.charAt(i) + "-Consonant");
                break;
            }
        }
    }
}
