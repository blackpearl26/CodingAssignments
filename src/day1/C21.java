package day1;

import java.util.Scanner;

public class C21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println(num+" is not prime");
		}
		else {
			System.out.println(num+" is prime");
		}
	}

}
