package hello;
import java.util.Scanner;

public class tenninnetwoprg {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size=in.nextInt();
		int []arr=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the input");
			arr[i]=in.nextInt();
		}
		System.out.println("The Output is");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
