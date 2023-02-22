package day2;

import java.util.HashSet;
import java.util.Set;

public class C5 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {4,3,3,7};
		
		Set<Integer> list = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr2[j]==arr1[i]) {
					list.add(arr1[i]);
				}
			}
		}
		System.out.println(list);
	}

}
