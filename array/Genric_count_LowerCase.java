package array;
import java.util.Scanner;
public class Genric_count_LowerCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the N");
	int n = sc.nextInt();
	
	sc.nextLine();

	char ch[] = new char[n];
	System.out.println("Enter the Charators");
	for(int i=0;i<ch.length;i++) 
	{
		String s = sc.nextLine();
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

