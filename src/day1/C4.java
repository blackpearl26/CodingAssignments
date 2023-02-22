package day1;

import java.util.Scanner;

public class C4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		
		
		
	}

}
