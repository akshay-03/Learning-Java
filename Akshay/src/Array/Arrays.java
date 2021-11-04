package Array;

public class Arrays {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		double sum = 0;
		double avg = 0.0f;
		double n = arr.length;
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
			
		}
		avg = sum/n;
		System.out.println("The average of array elements is: " + avg);
		
	}
	
}
