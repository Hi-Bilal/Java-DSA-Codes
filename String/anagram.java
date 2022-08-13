package String;

public class anagram {
	public static void main(String[] args)
	{
		String s = "A quick brown fox jumps over the lazy dog";
		s = s.toLowerCase();
boolean flag = true;
		for(char ch='a';ch<='z';ch++) {
			if(!s.contains(ch+"")) {
				flag=false;	
			}
}
		System.out.println(flag);
	}
}
 