import java.util.Scanner;
public class while_even {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Num");
		int num =scan.nextInt();
		
		int c=1;
		int mul=1;
		
		while(c <= num) 
		{
			if(c%2==0) 
			{
			mul=mul*c;
			}
			c++;
			
		}
		System.out.println(mul);


	}

}
