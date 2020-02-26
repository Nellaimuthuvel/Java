public class ArrayRotate 
{	

	public static void rotate(int[] arr, int d) 
    {
		/* Your class should be named ArrayRotate
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to print or return the output.
      		 * Taking input and printing the output is handled automatically.
     		 */
        int n = arr.length;
       for (int i = 0; i < d; i++) 
       {
            Rotates(arr, n); 
    } 
    }
   public static void   Rotates(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
    
	
}
