import java.util.Scanner;
public class Prime_no_range {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Num for Range");
		int num = scan.nextInt();
		
		int i = 0;
		int j =0 , c = 0;
		
		for(i = 0 ; i <= num ; i++ )
		{
			for(j = 2 ; j <= i ; j++)
			{
			if(i % j == 0)
			{
				break;
			}
		}
				if(j == i) 
				{
					System.out.print(i+" ");
					c++;
			
				}
          }
		System.out.println();
		System.out.println("count --> "+c);
	}
}


