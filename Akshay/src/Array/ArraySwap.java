package Array;
import java.util.Arrays;

public class ArraySwap {

	public static void main(String[] args) {
		
		int n = 6;
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		
		System.out.println(Arrays.toString(arr));
		Swap(arr, 2, 5);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void Swap(int[] arr, int swapA, int swapB) {
		
		int posA, posB;
		
		posA = arr[swapA];
		posB = arr[swapB];
		
		arr[swapA] = posB;
		arr[swapB] = posA;
		
		System.out.println("The swapped values are: "+ Arrays.toString(arr));
		
			
		}
		
	}


