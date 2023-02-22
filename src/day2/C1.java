package day2;

public class C1 {
	public static void main(String[] args) {
		int[] arr = {5,10,15,10,5,20,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		double average = sum/arr.length;
		System.out.println("Average is = "+average);
		
			
	}

}
