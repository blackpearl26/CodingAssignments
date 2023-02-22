package day3;

import java.util.Scanner;

public class C9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String str = sc.nextLine();
		
		String[] arr = str.split(" ");
		System.out.println("Total no of words = "+arr.length);
	}

}
