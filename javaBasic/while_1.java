import java.util.Scanner;
public class while_1
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		
		int i = 1;
		
		while( i <= num)
		{
			System.out.println(i);
		}

	}

}
