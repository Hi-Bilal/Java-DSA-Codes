package String;
import java.util.Scanner;
public class Split {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s=scan.nextLine();
		
		String []a=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
