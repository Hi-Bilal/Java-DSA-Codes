import java.util.Scanner;
public class rohit_bhaii {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			
			double F =  sc.nextDouble();
			
			
			//double Celsius = (Fehrenheiet-32)*5556;
			double Celsius = ((F-32)*5)/9  ;
			
			System.out.println(Celsius);

		}

	}

