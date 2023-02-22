package day1;

import java.util.Scanner;
/*
 You have to take input N from user and store it in variable and write the code to print :

A series which contains Prime number at N(th) position in Prime Number Series and Prime number at
Preceeding (N-1)th position and Prime number at Succeeding (N+1) position. N is N(th) term of the 
Prime Number Series.
*/
public class P1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int position = sc.nextInt();
		int point =0;
		int num=2;
		if(position>1&&position<1000) {
		while(point<=position+1) {
			int count=0;
			for(int i=2;i<num;i++) {
				
				if(num%i==0) {
					count++;
				}
				
			}
			if(count==0) {
				point++;
				if(point==position||point==position-1||point==position+1) {
					System.out.print(num+" ");
				}
			}
			num++;
			
		}
		}else {
			System.out.println("\"INVALID INPUT\"");
		}
	}
}
