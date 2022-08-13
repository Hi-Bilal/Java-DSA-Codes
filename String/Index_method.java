package String;
import java.util.Scanner;
public class Index_method {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1 = scan.nextLine();
		
		System.out.println("Enter the next String");
		String s2 = scan.next();
		
		int s3 = s1.indexOf(s2);
		
		System.out.println(s3 );
		System.out.println(s1.lastIndexOf(s3));
	}

}
