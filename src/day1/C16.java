package day1;
//import static java.lang.StrictMath.min;
import java.util.Scanner;

public class C16 {
	static int min(int a,int b) {
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		int a=num1;
		int b = num2;
		int min = min(num1,num2);
		System.out.println("smaller number is "+min);
		
		int hcf=1;
		
		for(int i=2;i<min;i++) {
			while(num1%i==0 && num2%i==0) {
				hcf=hcf*i;
				num1 = num1/i;
				num2 = num2/i;
				
			}
		}
		System.out.println("Factorial of "+a+" and "+b+" is = "+hcf);
		
	}

}
