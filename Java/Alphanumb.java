package hello;
import java.util.*;
public class Alphanumb {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				char ch =(char)(i+65);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}

}
