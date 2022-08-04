package Array_Practice;
import java.util.Scanner;
public class Min_and_max_Element {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no. of Elements to stored");
		int n = scan.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the Elements");
		for(int i = 0 ; i < n ; i++)
		{
			a[i] =  scan.nextInt();
		}
		
		int max = a[0];
		int min = a[0];
		
		for(int i = 0 ; i < n ; i++)
		{
			if(a[i] > max)
				max = a[i];
		
		else if(a[i] < min)
			min = a[i];
		}
		
		System.out.println("Maximum element in this array: \n"+max);
		System.out.println("Mimimum element in this array: \n"+min);
	}
}
