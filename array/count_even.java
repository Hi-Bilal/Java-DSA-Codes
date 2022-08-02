package array;
import java.util.Scanner;
public class count_even {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter n :---");
	int n = scan.nextInt();
	
	int a[] = new int[n];
	System.out.println("Enter the Elements");
	for(int i = 0; i < n;i++)
		a[i] = scan.nextInt();
	int c = 0;
	for(int i = 0 ; i < a.length ; i++)
	{
		if(a[i]%2==0); 
		c++;
	}
	System.out.println(c);
    }
}
