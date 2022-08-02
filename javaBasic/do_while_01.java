import java.util.Scanner;
public class do_while_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		
		int i = 1;
		
		do
		{
			System.out.println(i);
			i++;
		}
		while(i <= num);

	}

}
