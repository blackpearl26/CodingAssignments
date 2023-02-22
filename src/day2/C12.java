package day2;

public class C12 {
	
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		
		print(arr);
		int length = arr.length;
		int mid = (length-1)/2;
		System.out.println("mid = "+mid);
		for(int i=mid-1;i>=0;i--) {
			for(int j=arr.length-1;j>mid;j--) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		print(arr);
		
		
	}

}
