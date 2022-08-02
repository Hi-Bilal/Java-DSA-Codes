package Matrix;

import java.util.Scanner;

public class SumofLowerTringle {


			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				
				int n = scan.nextInt();
				int m = scan.nextInt();
				
				int a[][] = new int[n][m];
				
				for(int i  = 0 ; i < n ; i++)
				{
					for(int j = 0 ; j < m ; j++)
					{
						a[i][j] = scan.nextInt();
					}
				}

		int sum = 0 ;
				for(int i  = 0 ; i < n ; i++)
				{
					for(int j = 0 ; j <= i ; j++)
					{
						sum = sum + a[i][j];
					}
			}
			System.out.println(sum);	
			}
		}


