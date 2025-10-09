package hello;
import java.util.*;

public class oddevensum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int a=0,b=0;
		for(int i=0;i<=n;i++)
		{
			if(i%2==0) {
				a=a+i;
			}
			else {
				b=b+i;
			}
				
			
		}
		System.out.println("odd "+ a);
		System.out.println("even "+ b);


	}
	

}
