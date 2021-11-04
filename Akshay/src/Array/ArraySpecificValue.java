package Array;

public class ArraySpecificValue {

	
	
		public static boolean specific(int[] arr, int item) {
			
			
			
			for (int i : arr) {
				
				if(item == i) {
					return true;
					}
				
			}
				return false;
					
			}
			
		public static void main(String[] args) {
			
			int n = 5;
			int[] arr = new int[n];
			
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			arr[3] = 4;
			arr[4] = 5;
			
			System.out.println(specific(arr,4));
			
			
		}

}