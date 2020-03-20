

public class InsertionSort {	
	//arr is the input array you have to sort
	public static void insertionSort(int[] arr){
		//write your code here
        int n = arr.length;
        for (int i = 1; i < n; ++i) 
        { 
            int key = arr[i]; 
            int j = i - 1; 
  
           
            while (j >= 0 && arr[j] > key) 
            { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
	}
}
}
