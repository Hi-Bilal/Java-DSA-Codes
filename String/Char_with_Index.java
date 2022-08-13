package String;

public class Char_with_Index {

	public static void main(String[] args) {
		String s1 = "hello";
		int temp[] = new int[26]; // at index 0 -> store count of a
		
		for(int i=0;i<s1.length();i++) {
			char ch = s1.charAt(i);
	
		
			int index = ch - 'a';
			temp[index] = temp[index] + 1;
		}
		
		for(int i=0;i<temp.length;i++)
	      {
	          if(temp[i]!=0)
				{
	        
	        	  
	        	  int val = i+97;  // getting the ascii value of a character , a -> 97, b -> 98
	        	  char ch = (char) val;
	        	  System.out.println("Char : "+ch +" freq : "+temp[i]);
	        	
	           }

          }
	}
}
