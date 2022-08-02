package array;

import java.util.Scanner;

public class pal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = scan.nextInt();
		
		System.out.println("Enter the Elements");
		int a[] = new int[n];
		for(int i = 0 ; i<a.length ; i++)
			a[i] = scan.nextInt();
		
		int i = 0;
		
		boolean flag = true;
		int j = a.length-1;
		while(i<j)
		{
			if(a[i]!=a[j])
			{
			flag=false;
			
			break;
			}

			i++;
			j--;
			}
		System.out.println(flag);

	}

}
