package String;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Enter the String");
	        String s1=scan.nextLine();
	        
	        String s2="";//Temp String
	       
	        for(int i=s1.length()-1; i>=0; i--)
	        {
	           s2=s2+s1.charAt(i);
	            }
	        if(s2.equals(s1))
	        {
	            System.out.print("Palindrome");
	            }
	        else{
	            System.out.print("Not a Palindrome");
	            }
	}
}
