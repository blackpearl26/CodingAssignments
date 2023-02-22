package day1;

import java.util.Scanner;

public class C24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		System.out.println("Armstrong numbers from 1 to "+num);
		for(int i=1;i<num;i++) {
			int a=i,b=i;
			int digits=0;
			while(a>0) {
				digits++;
				a=a/10;
			}
			int res=0;
			while(b>0) {
				res += Math.pow(b%10, digits);
				b=b/10;
			}
			if(i==res) {
				System.out.print(i+" ");
			}
			
		}
	}

}
