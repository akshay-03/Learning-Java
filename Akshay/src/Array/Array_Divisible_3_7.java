package Array;

public class Array_Divisible_3_7 {

	public static void main(String[] args) {
		
		int[] arr = {1,3,4,5,7,21,9,42};
		int num;
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
				if((arr[i])%3==0 || (arr[i])%7==0) {
					
					num = arr[i];
					System.out.println(num);
					
				}

	}

}
}
