package hello;
import java.util.Scanner;

public class calc {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("1st Val: ");
			int  a = in.nextInt();
			int c = 0;
			while(true)
			{
			System.out.println("Enter your choice ");
			int n = in.nextInt();
			    System.out.println("Enter 2 nd Value : ");
			    int b = in.nextInt();
	    		switch(n){
	    		    case 1:{
	    		        a+=b;
	    		        System.out.println("Addition: "+a);
	    		        break;
	    		    }
	    		    case 2:{
	    		    	a-=b;
	    		        System.out.println("Subraction: "+a);
	    		        break;
	    		    }
	    		    case 3:{
	    		    	a*=b;
	    		        System.out.println("Multiplication: "+a);
	    		        break;
	    		    }
	    		    case 4:{
	    		    	a/=b;
	    		        System.out.println("Division: "+a);
	    		        break;
	    		    }
	    		    case 5:	    		    	a%=b;
	    		        System.out.println("Mod: "+a);
	    		        break;
	    		    }
	    		    default:{
	    		        System.out.println("No such case");
	    		    }
	    		}
			}
		}
	}



