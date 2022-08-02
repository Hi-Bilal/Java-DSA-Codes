package practice;
import java.util.Scanner;
public class method_to_read_N {

	public static void main(String[] args) {
		   int a = scan_data();
	        print(a);

	    }
	    static int scan_data()
	    {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the Number");
	        int num = scan.nextInt();
	        return num;
	    }
	    static int print(int n)
	    {
	    	int i;
	        for( i = 1; i<=10;  i++)
	        {
	            System.out.print(n*i+" ");
	           return n;
	        }
	    }
}
