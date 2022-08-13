package String;
import java.util.Scanner;
public class Reverse_word_By_Word {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1 = scan.nextLine();
		
		String[] s = s1.split(" ");
			
			for(int i = s.length-1; i >= 0; i--)
			{
				System.out.print(s[i]+" ");
	  }
	}
}
