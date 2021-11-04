package Array;

public class ArrProb2 {
	
	public static void main(String[] args)
	{
		int[] arr = {0,1,0,0,2,0,3,0};
		
		
		int i = 0;
		int j = arr.length - 1;
		
		while(i < j)
		
		{
			if(arr[i] == 0)
			{
				i++;
				continue;
			}
			
			if(arr[j] == 0)
			{
				j--;
				continue;
			}
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			i++;
			j--;
			
		}
		
		for(int k = 0; k < arr.length; k++) {
			
			System.out.print(arr[k] + " ");
			
			
		}
		

	}
	

}
