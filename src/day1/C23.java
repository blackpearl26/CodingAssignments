package day1;

import java.util.Scanner;

public class C23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int orgNum = n;
		int num = n;
		int digits=0;
		while(num>0) {
			digits++;
			num=num/10;
		}
		System.out.println("Total number of Digits = "+digits);
		int genNumber=0;
		while(n>0) {
			genNumber += Math.pow(n%10,digits);
			n=n/10;
		}
		System.out.println("Result Number = "+genNumber);
		if(orgNum==genNumber) {
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It is not an armstrong number");
		}
		
		
	}

}
