package Array;

import java.util.Arrays;

public class ArrayInsert {
	
	public static int[] Insert(int[] arr, int insert, int num) {
		
 
		
		for(int i = insert; i < arr.length-1; i++)
		{
			
			arr[i+1] = arr[i];
			
		}
		arr[insert] = num;
		return arr;
		
							
	}
		
	public static void main(String[] args) {
		
		int n = 5;
		int[] arr = new int[n];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		arr = Insert(arr,3,7);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
