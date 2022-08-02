package array;
import java.util.Arrays;
public class Selection_Short {

	public static void main(String[] args) {
		int a[]={2,1,4,3,5};
		
	    for(int i=0;i<a.length-1;i++)
	    {
	      int minindex=i;
	      for(int j=i+1;j<a.length;j++)
	      {
	        if(a[j]<a[minindex])
	        {
	          minindex=j;
	        }
	      }
	      //Swapping//
	      int temp=a[i];
	      a[i]=a[minindex];
	      a[minindex]=temp;
	    }
	    System.out.println(Arrays.toString(a));


	}

}
