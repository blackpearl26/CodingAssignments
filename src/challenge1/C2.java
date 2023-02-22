package challenge1;

import java.util.Scanner;

public class C2 {
	static void insetElement(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("arr"+(i+1)+(j+1)+"=");
				arr[i][j]=sc.nextInt();
			}
		}
	}
	
	static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("No of rows: ");
		int row=sc.nextInt();
		System.out.print("No of columns: ");
		int cols = sc.nextInt();
		int[][] arr = new int[row][cols];
		insetElement(arr);
		System.out.println("Elements in the array are: ");
		display(arr);
		System.out.println("Rotate anticlockwise");
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<arr[i%(arr.length)].length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
