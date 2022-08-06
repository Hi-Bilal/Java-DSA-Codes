package String;

public class Count_the_Spaces {

	public static void main(String[] args) {
		 
		String s = "Welcome to the redZone";
		
		int count = 0;
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char c = s.charAt(i);
			if( c == ' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
