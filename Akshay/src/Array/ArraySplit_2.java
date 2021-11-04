package Array;

import java.util.Arrays;

public class ArraySplit_2 {

	public static void main(String[] args) {
		
		
		int[] array = {2,2};
		
		int evenLength = 0;
		int oddLength = 0;
		
		for (int i=0; i < array.length; i++)
		{
			if(array[i] % 2 ==0)
			{
				evenLength++;
				
			}
			
			
			else {
				oddLength++;
			}
			
			
		}
		
		int[] even = new int[evenLength];
		int[] odd = new int[oddLength];
		
		int j=0, k=0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] %2 ==0) {
				
				
				even[j++] = array[i];
				
				
				
			}
			
			else {
				odd[k++] = array[i];
			}
			
			
			
	}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));

		
	}

}
