import java.util.Scanner;
public class elder_younger
{

	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the 1st Person Age");
		int a = scan.nextInt();
		

		System.out.println("Enter the 2nd Person Age");
		int b = scan.nextInt();
		

		System.out.println("Enter the 3rd Person Age");
		int c = scan.nextInt();
		

		  if ((a>b) && (a>c))
		   {
		       System.out.println("Elder is A");
		   }
		   else
		   {
			   System.out.println("Younger is A");
		   }
		   if ((b>a) && (b>a))
		   {
			   System.out.println("Elder is B");
		   }
		   else
		   {
			   System.out.println("Younger is B");
		   }
		   if ((c>a) && (c>a))
		   {
			   System.out.println("Elder is C");
		   }
		   else
		   {
			   System.out.println("Younger is C");
		   }
		   
		 }

	}


