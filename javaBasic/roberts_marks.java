import java.util.Scanner;
public class roberts_marks {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Maths Marks");
		double m = scan.nextDouble();
		

		System.out.println("Enter the Physics Marks");
		double p = scan.nextDouble();
		

		System.out.println("Enter the Chemistry Marks");
		double c = scan.nextDouble();
		
		double total = m+p+c;
		
		System.out.println("Total Robert Marks is:-  "+total);
		
		double  max_marks = 300;
		double  per = total/300*100;

		
		System.out.println("Roberts percentage:-  "+per);

	}

}
