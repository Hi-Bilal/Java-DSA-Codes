package array;
import java.util.Scanner;
public class Middle_is_Even {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Enter the N");
	        int n=scan.nextInt();
	        
	        int a[]=new int[n];
	        System.out.println("Enter the Elements");
	        for(int i=0;i<a.length;i++)
	        {
	            a[i]=scan.nextInt();
	        }
	        int mid=a.length/2;
	        if(a[mid]%2==0&&a[mid]>a.length)
	        {
	            System.out.println("Found");
	        }
	        else{
	            System.out.println("Not Found");
			}
	}

}
