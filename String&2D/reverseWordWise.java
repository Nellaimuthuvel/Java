public class Solution 
{
	public static String reverseWordWise(String input) 
    {
		// Write your code here
       
    int end = input.length();
    int i = input.length()-1;
     String news = "";
while(i>=0)
{
  if(input.charAt(i)==' ')
      
  {
      news= news + input.substring(i+1,end) + " ";
      end =i;
      
  }  
    i--;
}
        news = news +input.substring(i+1,end);
        return news;
        
}
}