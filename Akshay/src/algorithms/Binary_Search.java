package algorithms;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,5,7,8,12,34,78,90};
		int n = arr.length;
		int x = 34;
		
		int result = binarySearch(arr,0,n-1,x);
		
		if(result == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index: " + result);

	}
	
	static int binarySearch(int[] arr, int l, int r, int x) 
	{
		if( r >= l)
		{
			
			int mid = l + (r - l) / 2;
			
			//if the element is present at the
			//middle itself
			
			if(arr[mid] == x)
				return mid;
			
			
			//if element is smaller than mid
			//it must be in left-subarray
			
			if(arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);
			
			//Else the element can only be in
			//right subarray
			
			return binarySearch(arr, mid + 1, r, x);
			
			
		}
		
		return -1;
	}

}
