package array;

public class uperCase_count {

	public static void main(String[] args) {
		char[] ch= {'A','b','m','H','t'};
		int count=0;
		for(int i = 0 ; i < ch.length ; i++)
		{
		    if(ch[i] >= 'A' && ch[i] <='Z')
		    count++;
		}
		System.out.println(count);


	}

}
