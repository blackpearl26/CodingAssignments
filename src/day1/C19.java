package day1;

import java.util.Scanner;

public class C19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int num2 = num;
		int rev=0;
		while(num2>0) {
			int n = num2%10;
			rev = rev*10+n;
			num2 = num2/10;
		}
		System.out.println("original number = "+num);
		System.out.println("reverse number = "+rev);
		if(num==rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}

}
