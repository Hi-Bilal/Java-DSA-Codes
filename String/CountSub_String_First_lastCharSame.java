package String;
public class CountSub_String_First_lastCharSame {

	public static void main(String[] args) {
		String s="ANTARTICA";
		int count=0;
		for(int i=0;i<s.length();i++) 
		{
			for(int j=i;j<s.length();j++)
			{
				String s1=s.substring(i, j+1);
				if(s1.charAt(0)=='A' && s1.charAt(s1.length()-1)=='A') 
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
