package hello;
import java.util.*;
public class reversenum {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =in.nextInt();
		int sum=0;
		int i =0;
		int count=0;
		while (n>0)
		{
			count++;
			System.out.print(i=n%10);
			n=n/10;
		 sum+=i;
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(count);

}
}
