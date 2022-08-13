package String;
//import java.util.Scanner;
public class Sub_String {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		
		//System.out.println("Enter the String");
		String s1 = "We are in class, we are great";
		String s2 = "we";
		
		int count = 0;
	    String[] s = s1.split(" ");
	    
	    for(int i = 0 ; i < s.length ; i++)
	    {
				if(s[i].equalsIgnoreCase(s2))
				{
				count++;
				}
	    }
	    System.out.println(count);

	}

}
