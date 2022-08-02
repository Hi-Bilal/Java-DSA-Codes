package array;
import java.util.Scanner;
public class Genric_count_upperCase {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the N");
	int n = scan.nextInt();
	
	scan.nextLine();

	char ch[] = new char[n];
	System.out.println("Enter the Charators");
	for(int i=0;i<ch.length;i++) 
	{
		String s = scan.nextLine();
		ch[i] = s.charAt(0);	
	}
	int count = 0;
	for (int i = 0; i < ch.length; i++) 
	{
		if (ch[i] >= 'A' && ch[i] <= 'Z') 
		{
			System.out.println(ch[i]);
			count++;
		}
	}
	System.out.println(count);
  }
}

