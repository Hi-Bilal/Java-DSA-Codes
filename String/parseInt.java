package String;

public class parseInt {

	public static void main(String[] args) {
		String s1 = "abc1d8e8g8g7g2g5g";
		int sum=0;
		        for (int i = 0; i <= s1.length(); i++) {
		            char c = s1.charAt(i);
		            if (c >= '0' && c <= '9') {
		                int num = Integer.parseInt(c +"");
		                sum=sum + num;
		            }
		        }
		        System.out.println(sum);
	}
}
