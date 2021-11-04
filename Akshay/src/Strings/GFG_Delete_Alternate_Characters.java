package Strings;

import java.util.Scanner;

public class GFG_Delete_Alternate_Characters {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String of your choice: \n");
		String str = scan.nextLine();
		
		System.out.println(delAlternate(str));
		

	} 
	
	static String delAlternate(String S) {
		
		char str[] = S.toCharArray();
		char ch;
		String nstr = "";
		
		for(int i = 0; i < str.length; i++)
		{
			
			if(i%2 != 0)
			{
				continue;
			}
			
			else
			{
				ch = str[i];
				nstr = nstr + ch;
			}
			
			
		}
		
		return nstr;
		
		
	}

}
