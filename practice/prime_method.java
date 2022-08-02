package practice;
import java.util.Scanner;
public class prime_method {
	public static void main(String[] args) {
		
		int num = scan_data();
		prime(num);
     }
	static int scan_data() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		return num;
	}
	
	static void prime(int num)
	{
		int i = 0;
		for( i = 2 ; i  <= num ; i++)
		{
			if(num % i == 0)
				break;
			if(i == num)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("Not Prime");
			}
		}
	}
}
