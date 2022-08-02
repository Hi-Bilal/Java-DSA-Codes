import java.util.Scanner;
public class read_the_names {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = scan.nextInt();
		scan.nextLine();
		
		int i =1;
		
		String s = "Welcome to ";
		
		while(i<=n)
		{
			System.out.println("Enter the name : ");
			
			s = s + scan.nextLine()+" ";
			i++;
		}
		
		System.out.println(s);


	}

}
