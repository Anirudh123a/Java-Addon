package hello;
import java.util.Scanner;

public class date {
	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		in.useDelimiter("[/\\n]");

		int day=in.nextInt();

		int month=in.nextInt();

		int year=in.nextInt();
		
if(day>=30) {
	System.out.println("Day is valid");
}
	else{
		System.out.println("Day is  not valid");

		
	}
if(month>=12) {
	System.out.println("month is valid");
}
	else{
		System.out.println("month is  not valid");

		
	}
if(year>=2100) {
	System.out.println("year is valid");
}
	else{
		System.out.println("year is  not valid");

		
	}
}
		

		
	}


