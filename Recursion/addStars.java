
public class solution 
{

	// Return the updated string
	public static String addStars(String s) 
    {
		// Write your code here
if(s.length() == 1){
    

            return s; 
}
  
        String y = addStars(s.substring(1)); 
   
        char x = s.charAt(0); 
    if (y.charAt(0)== x)
    {
                
        return x + "*" + y;
 }

  else
  {
      return x+y;
  }
     
	}
}
