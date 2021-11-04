package ArrayList;
import java.util.ArrayList;



public class ArrayListSplit {
	
	
	
	public static void Split(ArrayList<Integer> arr) {
		
		int length = arr.size();
		
		
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for(int i =0; i < length; i++) {
			
			if(i % 2 == 0) {
				even.add(arr.get(i));
			}
			
			else {
				odd.add(arr.get(i));
			}
		}
		
		System.out.println(even);
		System.out.println(odd);
		
		
	}
	public static void main(String[] args) {
	
	int n = 5;
	ArrayList<Integer> arr = new ArrayList<Integer>(n);
	
	
	
	for (int i = 1; i <=n ; i++)
		arr.add(i);
	
		//System.out.println(arr);
		
		arr.add(9);
		//System.out.println(arr);
		
		arr.remove(3);
		//System.out.println(arr);
		
		Split(arr);

}
	
}
