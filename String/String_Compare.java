package String;

import java.util.Scanner;

public class String_Compare {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Enter 1st String");
	        String s1=scan.nextLine();
	        
	        System.out.println("Enter 2nd String");
	        String s2=scan.nextLine();
	     
	        if(s2.equals(s1))
	        {
	            System.out.print("Same");
	            }
	        else{
	            System.out.print("Not Same");
	            }
	}
}


