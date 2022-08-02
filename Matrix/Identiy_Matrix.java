package Matrix;

import java.util.Scanner;

public class Identiy_Matrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Row Size");
		int m = scan.nextInt();
		
		System.out.println("Enter the Column Size");
		int n = scan.nextInt();

		int a[][] = new int[m][n];
		
         System.out.println("Enter the Elements of 2-D Array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		boolean flag = true;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				 if(i==j)
				 {
					 if(a[i][j]!=1)
					 {
						 flag = false;
						 break;
					 }	 
				 }
				 else
					 {
					 if(a[i][j]!=0)
					 {
						 flag = false;
						 break;
					 }
				 }
			}
	}
		System.out.println(flag);
  }
}
