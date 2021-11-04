package Array;

public class ArrayProj {
	
	public static void main(String[] args) {
		
		int n = 5;
		int[] arr = new int[n];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for(int i=0; i < arr.length; i++) {
			System.out.println("The element at " + i + " position is " + arr[i]);
		}
	}

}
