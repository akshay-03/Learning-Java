package Array;

import java.util.Arrays;

public class ArrayCopy {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};
		arr = Copy(arr);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public static int[] Copy(int[] arr) {
		
		int[] arrayNew = new int[arr.length];
		
		for(int i=0; i < arr.length; i++) {
			
			arrayNew[i] = arr[i];
		}
		return arrayNew;
	}

}
