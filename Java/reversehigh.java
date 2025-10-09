package hello;
import java.util.Scanner;
public class reversehigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n1 = num;
        int n2 = 0;
        while (num != 0) {
            int digit = num % 10;
            n2 = n2 * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number: " + n2);

        if (n1 > n2) {
            System.out.println(n1 + " is greater than " + n2);
        } else if (n2 > n1) {
            System.out.println(n2 + " is greater than " + n1);
        } else {
            System.out.println("Both numbers are equal!");
        }
    }
}