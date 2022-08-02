package practice;
import java.util.Scanner;
public class method_prime {
	public static void main(String[] args) {

		int num = scan_data();
		even(num);
	}
	static int scan_data()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number");
		  int num = scan.nextInt();
		return num;
	}
	
	static void even(int num) {
		if (num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}
}
