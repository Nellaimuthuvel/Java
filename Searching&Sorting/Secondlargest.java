public class SecondLargest
{	
	
	public static int secondLargestElement(int[] arr) 
    {
		/* Your class should be named SecondLargest
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
  		 */
        int arr_size = arr.length;
if (arr_size < 2) 
        { 
            return -2147483648 ; 
        } 
       
      int  first =-1;
        int second=-1;
        for (int i = 0; i < arr_size ; i++) 
        { 
            
            if (arr[i] > first) 
            { 
                second = first; 
                first = arr[i]; 
            } 
       
          
            else if (arr[i] > second && arr[i] != first) 
                second = arr[i]; 
        } 

            return second;

	}
}
