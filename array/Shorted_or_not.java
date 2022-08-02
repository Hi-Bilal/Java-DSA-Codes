package array;

public class Shorted_or_not {

	public static void main(String[] args) {
	int a[] = {10,220,30,40,50};
		
		boolean sorted = true;
		
		for(int i = 0 ; i<a.length-1 ; i++)
		{
			if(a[i] > a[i+1])
			{
				sorted = false;
				break;
			}
		}
		System.out.println(sorted);
	}

}
