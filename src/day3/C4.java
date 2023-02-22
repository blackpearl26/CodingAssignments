package day3;

import java.util.Scanner;

public class C4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		
		int spaceCount=0;
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)==' ') {
				spaceCount++;
			}
		}
		
		System.out.println("No of words in text = "+(spaceCount+1));
	}

}
