package array;
import java.util.Scanner;
public class Genric_sum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Elements");
		int n = scan.nextInt();
		
		int a[] = new int[n];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}
