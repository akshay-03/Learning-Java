package Array;

public class ArrayAverage {
	
	public static double average(int[] arr) {
		
		int sum = 0;
		double avg = 0.0f;
		
		for (int i : arr) 
		{
			
			sum += i;
			avg = sum/i;
			 		
		}
		
		
		return avg;
				
				
	}
		
	public static void main(String[] args) {
		
		int n = 5;
		int[] arr = new int[n];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(average(arr));
		
		
	}
	

}
