import java.util.Scanner;
public class Salary_bonous 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter you Salary");
		double sal = scan.nextDouble();
		
		System.out.println("Enter the years in institution");
		int year = scan.nextInt();
		
		if(year >= 5)
		{
			Double bonous = sal * 5 / 100;
			
			System.out.println(bonous);
		}

	}

}
