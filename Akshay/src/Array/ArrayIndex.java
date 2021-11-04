package Array;

public class ArrayIndex {
	
	
	
public static int index(int[] arr, int num) {
		

		int i = 0;
		int len = arr.length;
		while (i < len) {
			
			if(arr[i] == num) {
				return i;
			}
			else i=i+1;
		}
		return -1;
				
				
	}
		
	public static void main(String[] args) {
		
		int n = 5;
		int[] arr = new int[n];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(index(arr,3));
		
		
	}

}
