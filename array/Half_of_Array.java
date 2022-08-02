package array;
import java.util.Scanner;
public class Half_of_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the N");
		int n = scan.nextInt();
		int index ;
		
		System.out.println("Enter the Elements");
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++)
		{
			a[i] = scan.nextInt();
		}
		        index = a.length/2;
				System.out.println("Mid Element ->  "+a[index]);
	}

}
