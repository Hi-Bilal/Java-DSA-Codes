package String;

public class Traget_Reverse_Rest_Same {

	public static void main(String[] args) {

		String s1 = "Welcome to programming concepts";
		String target = "Welcome";
		
		
		String[] sp = s1.split(" ");
		String temp = "";
		
		for(int i=0;i<sp.length;i++) {
			String val = sp[i];
			
			//If target found reverse the word and then add to temp
			if(val.equals(target)) {
				String rev = "";
				
				for(int j =val.length()-1;j>=0;j--) {
					rev = rev + val.charAt(j);
				}
				temp = temp + rev+" ";
				
			}
			
			//Its not target, put it as is on temp
			else {
				
				temp = temp + val+ " ";
				
			}
		}
		
		System.out.println(temp);
	}
}
