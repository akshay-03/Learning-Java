package Strings;

import java.util.Scanner;


public class GFG_Display_Longest_Name {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++)
		{
			int n = sc.nextInt();
			String[] names = new String[n];
			
			for(int j = 0; j < n; j++) names[j] = sc.next();
			
			GFG obj = new GFG();
			System.out.println(obj.longest(names, n));
		}
		
	}
		
}



class GFG {
    String longest(String names[], int n) {
        
        int max = 0;
        int index = 0;
        
        for(int i = 0; i < n; i++)
        
        {
            
            int len = names[i].length();
            
            if(len > max)
            {
                max = len;
                index = i;
            }
            
        }
        
        return names[index];
        
    }
}
