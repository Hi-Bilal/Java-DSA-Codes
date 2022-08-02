package array;
import java.util.Scanner;
public class Reversing_printing {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Length of Array");
        int n = scan.nextInt();
        System.out.println("Enter the Elements");
        int a[]= new int[n];
        {
            for(int i=0;i<a.length;i++)
                a[i]=scan.nextInt();
        }
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
	}
}
