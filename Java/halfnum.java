package hello;
import java.util.*;

public class halfnum {	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number ");
			int n = sc.nextInt();
			int m = n, r=1;
			int l =0,l1 =0, count =0;
			
			while(n>0){
			    int s = n%10;
			    l = l*10 +s;
			    n = n/10;
			    count++;
			}
			if(count%2 !=0) {
				r=r*10;
			}
			for(int i = 1;i<=count/2;i++) r = r*10;
			int op = m%r , num = m/r;

			while(op>0){
			    int so = op%10;
			    l1 = l1*10 +so;
			    op = op/10;
			}
			System.out.println((num*r)+l1);
		
	}

}
