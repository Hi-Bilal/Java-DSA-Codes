package array;
import java.util.Scanner;
public class is_shorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number for Range");
        int n = sc.nextInt();

        int[] a = new int[n];
        
        if(n==1){
          System.out.println("Yes");
            return;

        }

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < a.length - 1; i++) {
         if (!(a[i + 1] >=a[i])) {                
         isSorted = false;
                break;
            }

        }

        if (isSorted == false) {
            System.out.println("No");
        }

        else {
            System.out.println("Yes");

        }

    }
}
