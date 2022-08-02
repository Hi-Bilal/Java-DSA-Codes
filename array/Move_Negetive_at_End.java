package array;

public class Move_Negetive_at_End {

	public static void main(String[] args) {
		
		int a[] = {10 , -10 , 20 , -20 , 30 ,-30};
		int b[] = new int [a.length];
		int j= 0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] >= 0)
			{
				b[j] = a[i];
			j++;
			}
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] < 0 )
			{
				b[j] = a[i];
				j++;			}
		}
		for(int i = 0 ; i < a.length ; i++)
			System.out.print(b[i]+" ");
	}
}
