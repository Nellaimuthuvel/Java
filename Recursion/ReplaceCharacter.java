
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) 
    {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
        if (input.length() <= 1) 
        { 
            return input; 
        } 
  
        
        if (input.charAt(0) == c1 )
        { 
            return c2 + replaceCharacter(input.substring(1, input.length()),c1,c2); 
        } 
  
        return input.charAt(0) + replaceCharacter(input.substring(1, input.length()),c1,c2); 
    }
}

