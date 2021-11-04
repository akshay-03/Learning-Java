package Strings;

public class GFG_Count_Char {

	public static void main(String[] args) {
		
		String s = "#GeeKs01fOr@gEEks07";
		int[] res = count(s);
		
		for(int i = 0; i < 4; i++)
		{
			System.out.println(res[i]);
		}
		
	}
	
		public static int[] count (String s)
    {
        // your code here      
        
        int[] ans = new int[4];
        
        int uppercase = 0;
        int lowercase = 0;
        int numeric = 0;
        int special = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
            {
                uppercase++;
            }
            
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                lowercase++;
            }
            
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                numeric++;
            }
            
            else special++;
            
            
            ans[0] = uppercase;
            ans[1] = lowercase;
            ans[2] = numeric;
            ans[3] = special;
            
            
            
            
        }
        
        return ans;
        
    }
}