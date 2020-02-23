public class PushZerosAtEnd 
{
	
	public static void pushZerosAtEnd(int[] arr)
    {
		/* Your class should be named PushZerosAtEnd 
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to return or print the output.
     		 * Taking input and printing output is handled automatically.
     		 */
        int count = 0;  // Count of non-zero elements 
  
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; // here count is 
                                       // incremented 
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < arr.length) 
            arr[count++] = 0; 

	}
}
