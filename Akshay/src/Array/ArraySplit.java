package Array;

import java.util.Arrays;

public class ArraySplit {

		public static void Split(int[] arr) {
		
			
			int length = arr.length;
			int even_length = 0;
			int odd_length = 0;
			
			if(length % 2 == 0) {
				even_length = length/2;
				odd_length = length/2;
			}
			else {
				
				even_length = length/2 + 1;
				odd_length = length/2;
			}
		
			int[] even = new int[even_length];
			int[] odd = new int[odd_length];
			

			int j=0, k=0;
			for(int i = 0; i < arr.length; i++)
			{
				if(i%2==0) {
					
					
					even[j++] = arr[i];
					
					
					
				}
				
				else {
					odd[k++] = arr[i];
				}
				
				
				
		}
			System.out.println(Arrays.toString(even));
			System.out.println(Arrays.toString(odd));
	
		
							
	}
		
	public static void main(String[] args) {
		
		int n = 7;
		int[] arr = new int[n];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		
		
		Split(arr);
		//System.out.println(Arrays.toString(arr));
		
		
	}
		
}
