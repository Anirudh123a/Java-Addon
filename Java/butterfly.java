package hello;
import java.util.Scanner;
public class butterfly {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number ");
    int n=sc.nextInt();

	for(int i=1;i<=n*2-1;i++)
	{
		int m=i>n? (n*2)-i:i;
		for(int j=1;j<=n*2;j++){
			if(j<=m||j>(n*2-m)) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		
			
		}
		
		
	
		
	System.out.println();

}
    }
}

