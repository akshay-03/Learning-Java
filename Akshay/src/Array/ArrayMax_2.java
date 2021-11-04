package Array;

public class ArrayMax_2 {

	public static void main(String[] args) {
	
		int[] arr = {5,9,3,21,6,2,22};
		int max = Max(arr);
		System.out.println("The max value of element in array is: " + max);
	
	}

	public static int Max(int[] arr) {
		
		int n = arr.length;
		int a = arr[0];
		
		
		for(int i = 1; i < n-1; i++) {
			
			
			if(a < arr[i])
			{
				a = arr[i];
			}
			
			
		}
		return a;
			
	}
}