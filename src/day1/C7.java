package day1;

import java.util.Scanner;

public class C7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		if(num>=0) {
			System.out.println("positive number");
		}
		else {
			System.out.println("Negative number");
		}
	}

}
