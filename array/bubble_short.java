package array;
import java.util.Scanner;

public class bubble_short {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length of Array");
		int n = scan.nextInt();
		
		System.out.println("Enter the Elements");
		int a [] = new int [n];
		for(int i = 0 ; i < a.length ; i++)
			a[i] = scan.nextInt();
			
		
		for(int i=0; i<a.length; i++)
		{
		    for(int j=0; j<a.length-1-i ;j++)
		    {
		        if(a[j]>a[j+1])
		        {
		            int temp=a[j+1];
		            a[j+1]=a[j];
		            a[j]=temp;
		        }
		            
		    }
		}
		System.out.println("After Bubble Short:--");
	 for(int i = 0 ; i < a.length ;i++)
		 System.out.print(a[i]+" ");


	}

}
