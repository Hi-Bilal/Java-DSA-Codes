package String;
import java.util.Scanner;
public class FindTheLengthOfSubString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = scan.nextLine();
		
		System.out.println("Enter the Num for Find the Length of Sub-String");
		int num = scan.nextInt();
		
		int count = 0;
		
		for(int i = 0 ; i < s.length(); i++)
		{
			for(int j = i+1 ; j <= s.length(); j++)
			{
				String temp = s.substring(i,j);
				{
					int l = temp.length();
					
					if( l == num)
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
