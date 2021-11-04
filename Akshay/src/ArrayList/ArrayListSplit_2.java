package ArrayList;
import java.util.ArrayList;

public class ArrayListSplit_2 {

	
	public static void main(String[] args) {
		
	ArrayList<Integer> arr = new ArrayList<Integer>();
	 
	for (int i = 1; i <=10 ; i++) {
		arr.add(i);
	}
	arr.add(5);
	arr.add(6);
	arr.add(2);
	
	int size = arr.size();
	
	ArrayList<Integer> even = new ArrayList<Integer>();
	ArrayList<Integer> odd = new ArrayList<Integer>();
	
	for(int i = 0; i < size; i++) {
				if(arr.get(i)%2==0) {
					even.add(arr.get(i));
				}
				else {
					odd.add(arr.get(i));
				}
					
				
		
			
}
	
	System.out.println(even);
	System.out.println(odd);
	
}
}
