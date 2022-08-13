package String;

public class Dublicate {

	public static void main(String[] args) {
		
	String s1 = "abcdddef";
		
		String temp = s1.charAt(0) + "";

		char[] c = s1.toCharArray();

		for (int i = 1; i < c.length; i++) {
			if (c[i] != c[i - 1]) {
				temp = temp + c[i];
			}
		}

		System.out.println(temp);


	}

}
