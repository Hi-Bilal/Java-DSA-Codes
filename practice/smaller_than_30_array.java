package practice;

public class smaller_than_30_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,10,15,20,25};
		int count = 0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] < 30) {
				count++;
			}
		}
		System.out.println(count);
	}

}
