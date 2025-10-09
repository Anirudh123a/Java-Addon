package hello;

public class maxnum {
    public static void main(String[] args) {
        int a = 7, b = 15, c = 3, d = 9;
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        System.out.println("Maximum: " + max);
    }
}
