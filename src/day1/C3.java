package day1;

import java.util.Scanner;

public class C3 {
	
	public static int calcFactorial(int num) {
		if(num<=1)
			return 1;
		return num*calcFactorial(num-1);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		int factorial = calcFactorial(num);
		System.out.println("Factorial = "+factorial);
	}
}
