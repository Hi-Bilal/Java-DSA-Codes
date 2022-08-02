// Using XOR 

package array;

public class Unique_element {

	public static void main(String[] args) {
		
		int a[] = {7 , 3 , 5 , 4 , 3, 5 , 4};
		
		int xor = 0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			xor =  xor ^ a[i];
		}
       System.out.println("Unique Elements is :  " +xor);
	}

}
