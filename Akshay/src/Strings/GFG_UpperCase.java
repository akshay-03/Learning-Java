package Strings;

public class GFG_UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "i love programming i love programming i love programming i love programming i love programming";
		System.out.println(transform(s));

	}
	
	public static String transform(String s)
	   {
	       // code here
	   
	        
	        int n = s.length();
	        char[] ch = s.toCharArray();
	       ch[0] = Character.toUpperCase(ch[0]);
	       
	       
	       for(int i = 1; i < ch.length; i++)
	       {
	           
	           if(ch[i] == ' ')
	           {
	               ch[i+1] = Character.toUpperCase(ch[i+1]);
	             
	               i = i+1;
	           }
	       }
	       
	       s = String.valueOf(ch);
	       return s;
	       
	   }

}
