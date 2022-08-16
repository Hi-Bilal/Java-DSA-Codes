package String;
import java.util.Scanner;
public class Count3Substring {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String s = scan.nextLine();
//	
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<=s.length();j++)
//			{
//				
//				String temp=s.substring(i, j);
//				if(temp.length()==3)
//				{
//					count++;
//					System.out.println(temp+" ");
//				}
//				
//			}
//		}
//		System.out.println(count);
		String s = "abcd";
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = i; j < s.length(); j++)
			{
				String temp = s.substring(i, j + 1);
				System.out.println(temp);
				if (temp.length() == 3) 
				{
					count++;
				}
			}
		}
		System.out.println(count);



	}

}
