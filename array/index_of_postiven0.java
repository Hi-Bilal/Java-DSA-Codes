package array;
import java.util.Scanner;
public class index_of_postiven0 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the n :");
        int n=scan.nextInt();
        
        int a[]=new int[n];
        System.out.println("Enter the Elements :");
        for(int i=0;i<a.length;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0 ; i<n ; i++)
        {
            if(a[i]>0)
            {
                System.out.println(i);
                break;
            }
            else
            {
            	System.out.println(-1);
            	break;
            }
        }
	}
}


