package Strings;

public class Reverse_vowels {
	
	
	static boolean isVowel(char c) {
		
		return (c == 'A' || c == 'a' ||
				c == 'e' || c == 'E' ||
				c == 'o' || c == 'O' ||
				c == 'i' || c == 'I' ||
				c == 'u' || c == 'U');
		
	}
	
	
	static String reverseVowel(String s) {
		
		int j = 0;
		char[] str = s.toCharArray();
		String vowel = "";
		
		for(int i = 0; i < str.length; i++)
		{
			if(isVowel(str[i]))
			{
				j++;
				vowel += str[i];
			}
		}
		
		for(int  i = 0; i < str.length; i++)
		{
			if(isVowel(str[i])) {
				
				str[i] = vowel.charAt(--j);
				
			}
				
		}
		
		return String.valueOf(str);
		
		
	}
	
	public static void main(String[] args) {
		
		String str = "Hello World";
		System.out.println(reverseVowel(str));
		
	}
	

}
