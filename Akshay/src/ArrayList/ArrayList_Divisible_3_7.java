package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Divisible_3_7 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,4,5,7,21,9,42};
		
		
		System.out.println(Divisible(arr));
		
	}
	
	
	public static ArrayList<Integer> Divisible(int[] arr) {
		
		int n = arr.length;
		ArrayList<Integer> arl = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			
			if( (arr[i] % 3 ) == 0 || (arr[i] % 7 ) == 0) {
				
				arl.add(arr[i]);
				
			}
		}
		return arl;
		
			
	}

}
