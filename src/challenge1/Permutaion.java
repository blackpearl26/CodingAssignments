package challenge1;

import java.util.Scanner;

public class Permutaion {
	 static void display(String str,String res)
		{
			if(str.length() == 0)	//empty string
			{
				System.out.println(res);
				return;
			}
			for(int i=0;i<str.length();i++)
			{
				char r1 = str.charAt(i);
				String r2 = str.substring(0,i)+str.substring(i+1);
				display(r2,res+r1);
			}
		}
		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a String:");
			String str = sc.next();
			display(str,"");
		}

}
