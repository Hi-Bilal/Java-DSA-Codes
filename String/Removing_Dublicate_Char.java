package String;
import java.util.Scanner;
public class Removing_Dublicate_Char {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  
		  System.out.println("Enter the String");
		  String s = scan.next();
	        
	        String s1="";
	       
	        for(int i=0;i<s.length();i++)
	        {
	            if(!s1.contains(s.charAt(i)+""))
	            {
	                s1=s1+s.charAt(i);
	            }
	        }
	        System.out.println(s1);
	 }
}
