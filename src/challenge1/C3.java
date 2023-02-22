package challenge1;

import java.util.Scanner;

public class C3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text: ");
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		System.out.println("Output: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
