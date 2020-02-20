
public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
 if (
            input.length() == 0) { 
            return input; 
        } 
  
        // if the first character is 'p' 
        // and the first character of the part 
        // passed to recursion is 'i' then replace 
        //"pi" with "3.14" 
        if (input.charAt(0) == 'x') 
        { 
            return  removeX(input.substring(1, input.length())); 
        } 
  
        // if the first character is not 'p' 
        // then just put that character in 
        // front of the answer which came 
        // from recursion 
        return input.charAt(0) + removeX(input.substring(1, input.length())); 
	}
}
