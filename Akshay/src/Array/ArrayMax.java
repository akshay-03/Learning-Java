package Array;

public class ArrayMax{
	 public static void main(String[] args){
		 int[] arr = {1,9,3,21,6,2};

		 
		 int a = arr[0];

		 for(int i = 0; i < arr.length - 1; i++){
			 	a = Math.max(a,arr[i+1]);
		 	}
		 	System.out.println("The max value of element in array is: " + a);
	

}

}
