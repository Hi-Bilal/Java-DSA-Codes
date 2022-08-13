package String;
import java.util.Scanner;
public class String_reverse_CharbyChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1 = scan.nextLine();
		
		char [] s = s1.toCharArray();
		
		for(int i = 0 , j = s.length-1; i<j ; i++,j--)
		{
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
		}
		System.out.println("After Reversing String");
	     for(int i = 0 ; i < s.length ; i++)
	        System.out.print(s[i]);
	}
}
