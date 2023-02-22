package day3;

import java.util.Scanner;

public class C3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text: ");
		String instr = sc.nextLine();
		System.out.println("Reverse String: ");
		for(int i=instr.length()-1;i>=0;i--) {
			System.out.print(instr.charAt(i));
		}
	}

}
