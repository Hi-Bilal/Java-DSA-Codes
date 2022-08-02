package practice;

import java.util.Scanner;

public class sum_last_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		 int num = scan.nextInt();
		
		int sum = 0 ;
		 while (num > 0)
		 {
			 int rem = num % 10;
			 sum = sum*10 + rem ;
			 System.out.println(sum);
			 num = num / 10;
		 }
		// System.out.println(sum);
	}

}
