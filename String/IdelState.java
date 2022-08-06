package String;

import java.util.Scanner;

public class IdelState {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = s.next();
		
		boolean ideal = true;
		
		//we need two characters atleast
		if(str.length()>1) {
			
			//If first character is upper
			char ch1 = str.charAt(0);
			if(Character.isUpperCase(ch1))
			{
				//check rest of the characters
				
				int count = 0;
				for(int i =1;i<str.length();i++) {
					char c = str.charAt(i);
					if(Character.isLowerCase(c)) {
						count++;
					}
				}
				
				if(count!=str.length()-1) {
					ideal = false;
				}
			}
			
			else {
				ideal = false;
			}
			
		}
		
		else {
			ideal = false;
			//System.out.println("Enter valid string of more than 1 character");
		}
		
		
		System.out.println(ideal);


	}

}
