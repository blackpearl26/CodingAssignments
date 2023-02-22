package day1;

import java.util.Scanner;

public class C17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		
		int max = (num1>num2)?num1:num2;
		
		while(true) {
			if(max%num1==0 && max%num2==0) {
				System.out.println("LCM of "+num1+"and "+num2+"is = "+max);
				return;
			}
			max++;
		}
	}

}
