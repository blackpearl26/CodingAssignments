package day1;

import java.util.Scanner;

public class C15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int rev = 0;
		while(num>0) {
			int n = num%10;
			rev = rev*10+n;
			num=num/10;
			
		}
		System.out.println("Reverse number = "+rev);
		
	}

}
