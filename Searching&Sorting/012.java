public class Sort012
{	

	public static void sort012(int[] arr)
    {
		/* Your class should be named Sort012
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
int i=0;
        int temp;
        int size = arr.length-1;
        int nextzero = 0;
        int nexttwo = size;
while(i<=nexttwo)
{
            
    
            if(arr[i]==0)
            {
                
                temp=arr[nextzero];
                arr[nextzero]=arr[i];
                arr[i]=temp;
                nextzero=nextzero+1;
                i=i+1;
            }
    else if(arr[i] ==2)
    {
         temp=arr[nexttwo];
                arr[nexttwo]=arr[i];
                arr[i]=temp;
                nexttwo--;
        
    }
    else{
        i=i+1;
    }
}
        
        }
}
