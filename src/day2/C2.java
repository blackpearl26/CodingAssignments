package day2;

public class C2 {
	static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {4,2,5,3,8,1,7,9,6};
		System.out.println("Elements before sorting: ");
		print(arr);
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements after sorting");
		print(arr);
		System.out.println("Largest element in array = "+arr[0]);
		System.out.println("Second largest element in array = "+arr[1]);
		
		
		
	}

}
