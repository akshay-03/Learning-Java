package Strings;

public class ReversingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "practice";
		System.out.println(reverseVowel(str));
	
		
	}
	static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
	
	
	static String reverseVowel(String str) {
		
		int i = 0;
		int j = str.length() - 1;
		char[] str1 = str.toCharArray();
		
		while(i < j)
		{
			if(!isVowel(str1[i]))
			{
				i++;
				continue;
			}
			
			if(!isVowel(str1[j]))
			{
				j--;
				continue;
			}
			
			char t = str1[i];
			str1[i] = str1[j];
			str1[j] = t;
			
			i++;
			j--;
			
			
		}
		
		String str2 = String.copyValueOf(str1);
		return str2;
		
		
	}
}
