package day1;

import java.util.Scanner;

public class C25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int res=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				res += i;
			}
		}
		System.out.println("Result number = "+res);
		if(num==res) {
			System.out.println("It is perfect number");
		}
		else {
			System.out.println("It is not a perfect number");
		}
		
		
	}

}
