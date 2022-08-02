import java.util.Scanner;
public class Multiple_of_3_skip_Even
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1 ; i <= n; i++)
		{
			if(3 % i == 0)
			{
				if( i % 2 == 0)
				{
					continue;
					
				}
				System.out.println(i);
			}
		}

	}

}
