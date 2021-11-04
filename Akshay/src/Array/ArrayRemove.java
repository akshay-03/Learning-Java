package Array;

import java.util.Arrays;

public class ArrayRemove {


		
		public static int[] remove(int[] arr, int index) {
			
			int i;
			
			for(i = index; i < arr.length-1; i++)
			{
				arr[i] = arr[i+1];
				;
			}
			arr[arr.length-1] = 0;
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
			
			arr = remove(arr,3);
			System.out.println(Arrays.toString(arr));
			arr = remove(arr,1);
			System.out.println(Arrays.toString(arr));
			
			
			  
		}

	}