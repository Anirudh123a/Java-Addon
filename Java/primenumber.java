package hello;
import java.util.*;

public class primenumber {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int a = sc.nextInt();
		int b=0;
		for( int i=1;i<=a;i++) {
	
	
	if(a%a==0 && a%1==0) {
		b++;
	}
	}
		
		 if (b == 2) {
	            System.out.println( " is a prime number.");
	        } else {
	            System.out.println(" is not a prime number.");
	        }

		
		
	

	}

}



