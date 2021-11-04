package Arrays;

public class Reversing {
	
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		reverse(arr,arr.length);
		
	}
	
	
	
	static void reverse(int[] arr, int n) {
		
		int[] b = new int[n];
		
		int j = n;
		
		for(int i = 0; i < n; i++)
		{
			b[j-1] = arr[i];
			j--;
		}
		
		System.out.println("Reversed array is: \n");
		
		for(int k = 0; k < n; k++)
		{
			System.out.print(b[k]+" ");
		}
		
 		
	}
	

}
