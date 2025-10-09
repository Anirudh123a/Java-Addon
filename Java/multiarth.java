package hello;

public class multiarth {
	public static void main(String[] args) {
		String str = "82345+-%*";
		int a = str.charAt(0)-'0';//8
	
		
		for(int i=1;i<=str.length()/2;i++)
		{
		    int b = str.charAt(i)-'0';//2
		    char c = str.charAt(str.length()/2 + i);
		    //System.out.println(c);
		    switch(c)
		    {
		        case '+':{
		            a = a+b;
		            break;
		        }
		        case '-':{
		            a=a-b;
		            break;
		        }
		        case '*':{
		            a=a*b;
		            break;
		        }
		        case '/':{
		            a=a/b;
		            break;
		        }
		        case '%':{
		            a=a%b;
		            break;
		        }
		    }
		}
		    System.out.println(a);
	}
}


