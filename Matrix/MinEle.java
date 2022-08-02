package Matrix;

import java.util.Scanner;

public class MinEle {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	        int n=scan.nextInt();
	        int m=scan.nextInt();
	        
	        int a[][]=new int[n][m];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<m;j++){
	             a[i][j]=scan.nextInt();   
	            }
	        }
	        for(int i=0;i<n;i++)
	        {
	        	int min = a[i][0];
	            for(int j=0;j<m;j++)
	            {
	                if(a[i][j] < min )
	                {
	                	min = a[i][j];
	                }
	            }
	        
	        System.out.println(min);
	        }
	}
}



