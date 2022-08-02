import java.util.Scanner;
public class rev_using_for {

	public static void main(String[] args) {
		
       Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		
		while(num > 0)
		{
			int digit = num % 10;
			
			System.out.print(digit);
			
			num = num / 10;
		}

	}

}
