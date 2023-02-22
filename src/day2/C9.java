package day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C9 {
	static Scanner sc = new Scanner(System.in);
	static void insertElement(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element "+(i+1));
			int n = sc.nextInt();
			arr[i]=n;
		}
	}
	
	static void union(Set<Integer> obj,int[] arr1) {
		for(int i=0;i<arr1.length;i++) {
			obj.add(arr1[i]);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter number of elements to add in array1");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		insertElement(arr1);
		System.out.println("Enter number of elements to add in array2");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		insertElement(arr2);
		
		Set<Integer> set = new HashSet<>();
		union(set, arr1);
		union(set, arr2);
		System.out.println("Union of two arrays: ");
		System.out.println(set);
		

	}
}
