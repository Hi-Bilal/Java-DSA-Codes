package String;
import java.util.Scanner;
public class Trim_Method {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Enter the String");
		 String s1 = scan.nextLine();
		 
		 s1 = s1.trim();
		 
		 System.out.println(s1);

	}

}
