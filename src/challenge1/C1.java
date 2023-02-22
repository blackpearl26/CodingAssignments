package challenge1;

import java.util.HashSet;
import java.util.Set;

public class C1 {
	static void stringPermutation(String str) {
		Set<String> obj = new HashSet<String>();
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
			String str2 = str.substring(0, i)+str.substring(i+1);
			System.out.println(str2);
			
			//obj.add(str.charAt(i)+str2);
		}
		//System.out.println(obj);
	}
	public static void main(String[] args){
	String str = "ABC";
	//System.out.println(str.substring(1));
	//System.out.println(str.substring(1, 3));
	for(int i=0;i<str.length();i++) {
		String str2 = str.substring(0, i)+str.substring(i+1);
		stringPermutation(str.charAt(i)+str2);
	}
//	for(int i=0;i<str.length();i++){
//		String newStr = str.substring(0,i)+str.substring(i+1);
//		System.out.println(str.charAt(i));
//		System.out.println(newStr);
//
//	}
}
}
