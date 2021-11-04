package Strings;

import java.util.Scanner;

public class ConRevStr {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		String S1 = scan.nextLine();
		String S2 = scan.nextLine();
		
		scan.close();
	//	Solution obj = new Solution();
		System.out.println(Solution.conRevStr(S1, S2));
		
		

	}
}	
	
	class Solution {
		
		static String conRevStr(String S1, String S2) {
			
			String con = S1 + S2;
			
			String str = "";
			char ch;
			
			for(int i = 0; i < con.length(); i++)
			{
				ch = con.charAt(i);
				str = ch + str;
				
			}
			
			return str;
			
			
		}
		
		
	}


