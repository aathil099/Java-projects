
public class Selection_sort {

    void Sort(int arr[]) { 
		int n = arr.length; 
    // move remain unsorted sub array for each loop

		for (int i = 0; i < n-1; i++) {                  
        // find the lowest value of the element in unsorted array 
			
            int mini_value=i;
            for (int j = i+1; j < n; j++) { 
                	
			    if (arr[j] < arr[mini_value]){
				
                //make it the new arr[mini_value]				
			        mini_value = j;  
                } 
            } 
            // swap the minimum element found in unsorted 
            //sub array with the first element in unsorted sub array 	 	 	 
            int temp = arr[mini_value]; 
            arr[mini_value] = arr[i]; 
            arr[i] = temp; 
        }  
	} 
		
    static void printArray(int arr[]){   	 
	  	int n = arr.length; 
            for (int i=0; i<n; ++i) 
                System.out.print(arr[i]+" "); 
	  	        System.out.println(); 
    } 
 
    public static void main(String args[]){ 
  	    Selection_sort obj = new Selection_sort();
  	    
  	    int arr[] = {10,21,55,7,16,2,4};
  	    obj.Sort(arr); 
        System.out.println("Sorted array");
        printArray(arr); 
    } 
} 

