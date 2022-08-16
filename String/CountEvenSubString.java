package String;
import java.util.Scanner;
public class CountEvenSubString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s = scan.nextLine();
		
		int count = 0;
		
		for(int i = 0 ; i < s.length(); i++)
		{
			for(int j = i+1 ; j <= s.length(); j++)
			{
				String temp = s.substring(i,j);
				{
					if(temp.length()%2 == 0)
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
