package hello;
import java.util.*;

public class fibo {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		
		
		int n = sc.nextInt();
		
		int a=0,b=1,c;
		
		for(int i=1;i<=n;i++) {
			System.out.println(a+"");
			c=a+b;
			a=b;
			b=c;
			
			
			
		}
	}
}