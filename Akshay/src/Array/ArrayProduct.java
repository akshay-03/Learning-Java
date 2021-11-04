package Array;

public class ArrayProduct {
	
	public static void main(String[] args) {
		
			int[] arr = {1,4,5,6,7,3};
			
			int product = arr[0];
			int n = arr.length;
			
			for(int i = 1; i < n; i++) {
				
				product = product*arr[i];
			}
			
			System.out.println("The product of all the elements are: " + product);
	}

}
