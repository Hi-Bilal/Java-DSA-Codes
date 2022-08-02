package array;
import java.util.Scanner;
public class milk_Water{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				b[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				b[j]=a[i];
				j++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}


	}

}
