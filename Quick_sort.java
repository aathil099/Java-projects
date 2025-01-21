
public class Quick_sort {  
    
    int partition(int arr[], int low, int high){ 
        int pivot = arr[high]; // pivoting around last element 
 	 	int i = (low-1);  	// index of smaller element   	
 	 	
        for (int j=low; j<high; j++) { 
	        if (arr[j] < pivot) {	
		        // if current element is smaller than the pivot  
                i++; 
                //swap arr[i] and arr[j], putting arr[i] at end of left partition and arr[j] at end of right partition  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
	            arr[j] = temp; 
            }  
        } 
 	 	//i+1 is start of right partition 
 	 	//swap arr[i+1] and arr[high] (pivot), putting pivot in between left partition and right partition 
	  	int temp = arr[i+1]; 
	  	arr[i+1] = arr[high]; 
	  	arr[high] = temp; 

	return i+1; 	// return new position of the pivot 
    } 

	 
    void sort(int arr[], int low, int high) {  	// recursive quicksort function 
	    if (low < high){ 	// check proper values for low and high given  
		    int pi = partition(arr, low, high); // partitions about pivot and returns the new position of pivot 
	  	 	sort(arr, low, pi-1); 	// quicksort left partition 
	  	 	sort(arr, pi+1, high); // quicksort right partition 
        } 
    } 

    static void printArray(int arr[]) { 
        int n = arr.length;
            for (int i=0; i<n; ++i) 
                System.out.print(arr[i]+" "); 
                System.out.println(); 
    }

    public static void main(String args[]) { 
	    int arr[] = { 24,03,42,16,67,38,65,27};   	 
	    int n = arr.length; 
	 
    	Quick_sort ob = new Quick_sort(); 
	    ob.sort(arr, 0, n-1); 

	  	System.out.println("sorted array"); 
	  	printArray(arr); 
	} 
} 
