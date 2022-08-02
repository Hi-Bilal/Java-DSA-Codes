package array;
import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Length of Array");
		int n = scan.nextInt();
		
		System.out.println("Enter the Elements");
		int a[] = new int[n];
		for(int i = 0 ; i < a.length ; i++)
			a[i] = scan.nextInt();
		
		for(int i = 0 , j = a.length-1 ; i < j ; i++  , j--)
		{
			int t = a[i];
			a[i] = a[j];
			a[j] = t;
		}
		System.out.println("After Reversing Array:--");
		for(int i = 0 ; i < a.length ; i++)
			System.out.print(a[i]+" ");

	}

}
