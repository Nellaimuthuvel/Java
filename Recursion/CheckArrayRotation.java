

public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
		/* Your class should be named CheckRotation
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */


int n = arr.length;
    int min = arr[0], min_index = -1; 
        
        for (int i = 0; i < n; i++) 
        { 
            if (min > arr[i]) 
            { 
                min = arr[i]; 
                min_index = i; 
            } 
        }  
                    return min_index; 

    }

}
