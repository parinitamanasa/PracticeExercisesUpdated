import java.util.Scanner;

public class Sorting {
    public static void main(String args[]) {
        int n, temp, i = 0, sum = 0, j, k;
        int a[] = new int[20];
        System.out.println("Enter a Number");
        Scanner number = new Scanner(System.in);
        n = number.nextInt();
        temp = n;
        while (temp != 0) {
            a[i] = temp % 10;
            temp = temp / 10;
            if (a[i] % 2 == 0)
                sum = sum + a[i];
            i++;
        }
        for (j = 0; j < i; j++)
            System.out.print(a[j]);
        for (k = 0; k <= i; k++){
            for (j = k + 1; j <= i; j++) {
                if (a[k] < a[j]) {
                    temp = a[k];
                    a[k] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        for (j = 0; j < i; j++) {
            System.out.print(a[j]);
        }
        System.out.println();
        System.out.println("Sum: "+sum);
        if (sum > 15) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
