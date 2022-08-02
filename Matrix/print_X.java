package Matrix;

import java.util.Scanner;

public class print_X {

					public static void main(String[] args) {
						Scanner scan = new Scanner(System.in);
						
						int n = scan.nextInt();
						int m = scan.nextInt();
						
						int a[][] = new int[n][m];
						for(int i = 0 ; i < n ; i++)
						{
							for(int j = 0 ; j < m ; j++)
							{
								a[i][j] = scan.nextInt();
							}
						}
						
						 for (int i = 0; i < n; i++)
						 {
					            for (int j = 0; j < m; j++)
					            {
					                if (i == j || i + j == 2) 
					                {
					                    System.out.print(a[i][j]+" ");
					                }
					                else 
					                {
					                    System.out.print("  ");
					                }
					            }
					            System.out.println();
					        }
					}
		}
				
