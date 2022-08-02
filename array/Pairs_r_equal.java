package array;
import java.util.Scanner;
public class Pairs_r_equal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the N");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		int count=0;
		
		System.out.println("Enter the Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
