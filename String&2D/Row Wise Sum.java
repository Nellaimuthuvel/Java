import java.util.Scanner;
public class Solution 
{

	public static void main(String[] args) 
    {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
    Scanner s = new Scanner(System.in);    
        
int rows = s.nextInt();
int columns = s.nextInt();
int [][] input= new int[rows][columns];
                             
                                 
	for(int i=0;i<rows;i++)
    {
     
        for(int j=0;j<columns;j++)
        {
            input[i][j]=s.nextInt();
        }
    }
        
      for(int i=0;i<rows;i++)
    {
     int sum =0;
        for(int j=0;j<columns;j++)
        {
           sum=sum+ input[i][j];
        }
          System.out.print(sum + " ");
    }  
    
    
    }
}
