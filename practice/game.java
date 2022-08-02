package practice;

public class game {

	public static void main(String[] args) {
		
		   for (int i =1; i<=100; i++)
	        {
	           
	              System.out.println(i);
	              
	              if(i % 5 == 0 && i %10 != 0)
	              {
	                  System.out.println("CAR");
	              }
	              else if(i % 5 == 0 && i%10 == 0)
	              {
	                  System.out.println("BUS");
	              }


	}
 }
}
