import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		
		for(i = 2 ; i <= num ; i++)
		{
			if(num%i==0)
				break;
		
		if(num == i)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a Prime");
		}
	}
  }
}
