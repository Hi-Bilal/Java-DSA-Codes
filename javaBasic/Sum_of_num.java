import java.util.Scanner;
public class Sum_of_num
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		
		int i = 1;
		int sum =0;
		while( i <= num)
		{
			 sum = sum + i;
			 i++;
		}
		System.out.println(sum);

	}

}
