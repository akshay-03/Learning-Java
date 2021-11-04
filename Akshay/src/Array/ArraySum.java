package Array;

public class ArraySum {
	public static void main(String[] args) {
		
		int n = 5;
		int sum = 0;
		int[] arr = new int[n];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 5;
		
		for (int i : arr) {
			
			sum = sum + i;
			//sum += i;
			
		}
		System.out.println("The sum of the elements in array is: " + sum);
		
	}
}
