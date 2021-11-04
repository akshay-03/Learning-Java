package Strings;

public class GFG_Reverese_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "practice";
		System.out.println(modify(s));

	}
	

	
	public static boolean Vowel(char c) {
		
		return (c == 'a' || c == 'e' || c == 'i' ||
				c == 'o' || c == 'u' || c == 'A' ||
				c == 'E' || c == 'I' || c == 'O' || c == 'U');
	}

	public static String modify(String S) {
		
		int i = 0;
		int j = S.length() - 1;
		
		char[] str = S.toCharArray();
		
		while(i < j)
		{
			if(!Vowel(str[i]))
			{
				i++;
				continue;
			}
			
			if(!Vowel(str[j]))
			{
				j--;
				continue;
			}
			
			char t = str[i];
			str[i] = str[j];
			str[j] = t;
			
			i++;
			j--;
			
		}	
		
		String str1 = String.copyValueOf(str);
		System.out.println(str1);
		return str1;
		
		
	}

}