package array;
import java.util.Scanner;
public class Search_Elements {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the N :--");
		int n=scan.nextInt();
		int index=-1;
		
		System.out.println("Enter the Elements :--");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		
		System.out.println("Enter the Element to search the Index :--");
		int temp=scan.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==temp) {
				index=i;
				System.out.println(i);
				break;
			}
		}
		if(index==-1)
		{
			
		System.out.println(index);
			}

	}
}
