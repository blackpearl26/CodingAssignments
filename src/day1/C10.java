package day1;

import java.util.Scanner;

public class C10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int noOfDigits=0;
		int copy_num=num;
		while(copy_num>0) {
			copy_num = copy_num/10;
			noOfDigits++;
		}
		System.out.println("Number of Digits in Number:"+num+" are "+noOfDigits);
		int num2 = num;
		for(int i=noOfDigits;i>=1;i--) {
			int digit = num2%10;
			num2=num2/10;
			System.out.println("digit @"+i+" = "+digit);
		}
		
		
	}

}
