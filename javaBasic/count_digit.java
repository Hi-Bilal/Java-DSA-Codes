import java.util.Scanner;
public class count_digit {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		
	int sum =0;
		
		while(num > 0)
		{
			int digit = num % 10;
			sum = sum + digit; 
			num = num/10;
		}
	
            System.out.println(sum);
	}

}
