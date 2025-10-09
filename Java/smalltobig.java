package hello;


public class smalltobig {
	
		public static void main(String[] args) {
	       String str="AbC";
	        int ch=0;
	        for (int i=0;i<str.length();i++){
	            ch=str.charAt(i);
	            if(ch<=90){
	                ch=ch+32;
	            }
	            else{
	                ch=ch-32;
	            }
	        
	            System.out.println((char)(ch));
	        }
	        
		}
	}

