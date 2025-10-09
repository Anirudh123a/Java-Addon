package hello;

import java.util.Scanner;

public class task230925 {
	    public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the no: ");
	        int n = scanner.nextInt();
	        for (int i = 1; i <= n; i++) {

	            int a = i;

	            for (int j = 1; j <= i; j++) {
	                System.out.print(a + " ");
	                a = a + (n - j);
	            }

	            System.out.println();
	        }
	    }
	}


