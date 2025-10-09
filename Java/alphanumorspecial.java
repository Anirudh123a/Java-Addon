package hello;

public class alphanumorspecial {
    public static void main(String[] args) {
    	        char input = 'A';
    	        if(input >= 'a' && input <= 'z'){
    	            System.out.println("Lowercase Alphabets");
    	        } else if (input >= '0' && input <= '9') {
    	            System.out.println("Numbers");
    	        } else if (input >= 'A' && input <= 'Z') {
    	            System.out.println("Uppercase Alphabets");

    	        } else{
    	            System.out.println("Special");
    	        }
    	    }
    }

