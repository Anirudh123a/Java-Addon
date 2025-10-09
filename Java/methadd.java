package hello;
import java.util.Scanner;


public class methadd {

	
	    void display(int x,int y)
	    {
	        System.out.println("Addition : "+(x+y));
	    }
	    void display1()
	    {
	        System.out.println("World");
	    }
		public static void main(String[] args) {
		    
		    Scanner in  = new Scanner(System.in);
		    int size = in.nextInt();
		    methadd m = new methadd();
		    for(int i=0;i<size;i++)
		    {
		        int a=in.nextInt();
		        int b=in.nextInt();
		        m.display(a,b);
		    }	
			
			
		}
	}