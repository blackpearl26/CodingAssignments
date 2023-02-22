package day3;

import java.util.Scanner;

public class C1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String instr = sc.nextLine();
	
		String rev="";
		for(int i=instr.length()-1;i>=0;i--) {
			rev += instr.charAt(i);
		}
		System.out.println("Reverse Text: ");
		System.out.println(rev);
		
		if(instr.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
}
