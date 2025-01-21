
public class Merge_sort { 
    
    void merge(int arr[], int l, int m, int r) { // function to merge sorted halves 
	 
        // find the sizes of the two subarrays to be merged  
        int n1 = m - l + 1; 
        int n2 = r - m; 
        
        // create temporary arrays for left and right 
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
        
        // copy to temp arrays  
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        
        // Now we begin to merge the temporary arrays   	 	
        int i = 0, j = 0;  // initial indexes of left and right subarrays 
        int k = l; 	// initial index of merged subarry array 
	 
        // start merging 
        while (i < n1 && j < n2) {  
            
            if (L[i] <= R[j]){  
                arr[k] = L[i];  
                i++;
                
            } else { 
                arr[k] = R[j];
                j++; 
            } 
            k++; 	 
        } 
        
        while (i < n1) {  // copy remaining elements of L[] if any 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
        
        while (j < n2) { 	// copy remaining elements of R[] if any  	 
            arr[k] = R[j];  j++; 
            k++; 
        } 
    } 

    void sort(int arr[], int l, int r){ 	// recursive merge sort function 
        
        if (l < r){ 	 	 	// check valid left and right  
            int m = (l+r)/2; 	// get the middle point 
            // integer datatype, so rounds non-integer mids down (rounds towards zero) 
        
            // recursively merge sort left and right sub arrays 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
        
            merge(arr, l, m, r);  // merge the sorted sub arrays 
        } 
    } 

    static void printArray(int arr[]) { 	// prints out the array  
        int n = arr.length;  
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 	
            System.out.println(); 
    } 

    public static void main(String args[]) { 
        int arr[] = { 24,03,42,16,67,38,65,27}; 
        
        System.out.println("Given Array"); 
        printArray(arr); 
        
        Merge_sort ob = new Merge_sort(); 
        ob.sort(arr, 0, arr.length-1); 
        
        System.out.println("\nSorted array");   	
        printArray(arr); 
    }
} 
