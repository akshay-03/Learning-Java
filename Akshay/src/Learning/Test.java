package Learning;

public class Test {

		public static void main(String[] args) {
			
			int[] arr = {1,2,3,4,5,6,7};
			System.out.println(product(arr));
			
		}
		
		
			static int product(int[] arr) {
				
				
				int mul = 1;
				for(int i = 0; i < arr.length; i++)
				{
					mul = mul*arr[i];
				}
				
				return mul;
				
			}
		
}
