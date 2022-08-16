package String;
import java.util.Scanner;
public class SumOfSub_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = scan.next();
		
		int sum = 0;
		
		for(int i = 0 ; i < s.length(); i++)
		{
			for(int j = i + 1 ; j <= s.length() ; j++)
			{
				String s1 = s.substring(i,j);
				
				int t = Integer.parseInt(s1);
				
				sum = sum + t;
			}
		}
		System.out.println(sum);
	}
}
