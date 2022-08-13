package String;
import java.util.Scanner;
public class Count_It {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Sentence");
		String s1=scan.nextLine();
		
		System.out.println("Enter the word");
		String s2=scan.next();
		
		String []a=s1.split(" ");
		
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].contains(s2)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
