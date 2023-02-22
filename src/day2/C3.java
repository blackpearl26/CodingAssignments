package day2;

public class C3 {
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int[] arr = {10,12,6,8,5,4,15,3,2,7,9};
		System.out.println("Before sort: ");
		print(arr);
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("After sort: ");
		print(arr);
		
		System.out.println("Smallest element in array = "+arr[0]);
		System.out.println("Second smallest element in array = "+arr[1]);
		
	}

}
