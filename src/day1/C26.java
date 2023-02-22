package day1;

import java.util.Scanner;

public class C26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		System.out.println("Perfect numbers from 1 to "+num);
		for(int i=1;i<=num;i++) {
			int res=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					res += j;
				}
				
			}
			if(res==i) {
				System.out.print(i+" ");
			}
		}
	}

}
