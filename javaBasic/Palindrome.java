import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		int rem,sum=0;
		int temp = num;
		while(num > 0)
		{
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num/10;
		}
			
		if (temp == sum)	
		System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");

	}

}
