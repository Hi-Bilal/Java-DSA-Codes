package array;

import java.util.Scanner;

public class Move_zero_right {
		 public static void main(String[] args) {
			  Scanner sc= new Scanner(System.in);
			        int n = sc.nextInt();
			        int a[]= new int[n];
			        int b[]= new int[n];
			        int j=0;
			        for(int i=0;i<n;i++)
			        {
			            a[i]=sc.nextInt();
			        }
			       
			        for(int i=0;i<n;i++)
			        {
			         
			           if(a[i]!=0)
			           {
			               b[j]=a[i];
			               j++;
			           }
			           
			         }
			         for(int i=0;i<n;i++)
			        {
			         
			           if(a[i]==0)
			           {
			               b[j]=a[i];
			               j++;
			           }
			           
			         }
			        a=b;
			        for(int i=0;i<n;i++)
			        {
			         
			           System.out.print(a[i] + " ");
			           
	   }
	}
}
