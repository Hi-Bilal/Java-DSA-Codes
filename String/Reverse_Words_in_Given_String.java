package String;
import java.util.Scanner;
public class Reverse_Words_in_Given_String {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        String s1 = scan.nextLine();
	        
			String[] s = s1.split(" ");
			
			for(int i=0;i<s.length;i++)
			{
				 char[] c=s[i].toCharArray();
				 for(int j=c.length-1;j>=0;j--)
			        {
			            System.out.print(c[j]);
			        }
				 System.out.print(" ");
			}

	}
}
