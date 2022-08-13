package String;
import java.util.Scanner;
public class ConvertShortedStringToEncodedForm {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String s = scan.nextLine();
		
		String temp = s.charAt(0)+"";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			char c1=s.charAt(i);
			char c2=s.charAt(i+1);
			
			if(c1 == c2)
			{
				count++;
			}
			else
			{  
				temp=temp+count+c1;
				count=1;
			}
		}
		temp=temp+count;
		System.out.println(temp);
	}

}
