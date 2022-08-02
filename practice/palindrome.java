package practice;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		int temp = num;
		int sum = 0;
		
		while(num > 0)
		{
			 sum = sum + num % 10;
			 num = num / 10;
		}	
		if(temp == sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}

	}

}
