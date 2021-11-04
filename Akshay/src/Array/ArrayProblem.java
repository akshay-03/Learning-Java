package Array;

public class ArrayProblem {

	
		
		public static void main(String[] args)
		{
			int[] arr = {0,1,0,0,2,0,3,0};
			int [] brr = {-1,-1,-1,-1,-1,-1,-1,-1};
		
			for(int i = 0; i < arr.length; i++) {
				
				if(arr[i] == 0)
				{
					brr[i] = arr[i];
				}
			}
			
			int i = 0;
			int j = arr.length - 1;
			
			while(i < arr.length && j>=0)
			
			{
				if(arr[i] == 0)
				{
					i++;
					continue;
				}
				
				if(brr[j] == 0)
				{
					j--;
					continue;
				}
				
				brr[j] = arr[i];
				
				i++;
				j--;
				
			}
			
			for(int k = 0; k < brr.length; k++) {
				
				System.out.print(brr[k] + " ");
				
				
			}
			
	
		}
	
	
}
