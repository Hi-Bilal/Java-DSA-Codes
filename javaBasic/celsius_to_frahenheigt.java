import java.util.Scanner;
public class celsius_to_frahenheigt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter Fahrenheit ");
	 float f=scan.nextFloat();
	 
    float Celsius = (5*f-160)/9;
    Celsius = ((Fahrenheit-32)*5)/9  ;
    	System.out.println(Celsius);


	}

}
