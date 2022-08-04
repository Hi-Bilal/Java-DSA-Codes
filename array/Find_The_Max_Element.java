package array;
import java.util.Scanner;
public class Find_The_Max_Element {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the no. of Elements to store");
		int n = scan.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the Elements");
		for(int i = 0 ; i < n ; i++)
		{
			a[i] = scan.nextInt();
		}
		int max = a[0];
		
		for(int i = 0 ; i < n ; i++)
			if(a[i] > max)
				max = a[i];
		
		System.out.println("Max Elements --> "+max);
	}

}
