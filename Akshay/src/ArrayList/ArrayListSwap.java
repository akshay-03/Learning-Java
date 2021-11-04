package ArrayList;
import java.util.ArrayList;

public class ArrayListSwap {

	public static void main(String[] args) {


			ArrayList<Integer> array = new ArrayList<Integer>();
			int n = 5;
			for(int i=0; i<=n; i++) {
				array.add(i);
			}
			
			Swap(array,2,3);
			System.err.println(array);
			

	}
	
	public static void Swap(ArrayList<Integer> arr, int swapIndexa, int swapIndexb) {
		
		int valueatA = arr.get(swapIndexa);
		int valueatB = arr.get(swapIndexb);
		
		arr.set(swapIndexa,valueatB);
		arr.set(swapIndexb,valueatA);
		
		System.err.println(arr);
		
	}

}
