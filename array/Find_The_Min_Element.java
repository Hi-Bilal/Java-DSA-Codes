package array;
import java.util.Scanner;
public class Find_The_Min_Element {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Elements");
		int n = scan.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the Elements");
		for(int i = 0 ; i < n ; i++)
		{
			a[i] = scan.nextInt();
		}
		
		int min = a[0];
		
		for(int i = 0 ; i < n ; i++)
			if(a[i] < min)
				min = a[i];
		
		System.out.println("Minimum Element :   "+ min);

	}

}
