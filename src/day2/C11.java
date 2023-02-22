package day2;

public class C11 {
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,0,30,40,0,50,0};
		print(arr);
		int pointer=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				int temp = arr[pointer];
				arr[pointer]=arr[i];
				arr[i]=temp;
				pointer++;
			}
		}
		print(arr);
		
		
		
	}

}
