public class Insertion_Sort {
    void Sort(int arr[]){
        for(int i= 1; i < arr.length; i++){
            int test_value = arr[i];
            int j=i-1;
            System.out.println("Considering element: " + test_value + " i=" +i );
            while (j>=0 && arr[j]>test_value) {
                arr[j+1]=arr[j];
                j=j-1;
                System.out.println("Moved element: " + arr[j + 1] + " to position " + (j + 2));
            }
            arr[j+1]=test_value;
            System.out.println("Placed element: " + test_value + " at position " + (j + 1));
            System.out.print("Array state: ");
            
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println("\n");
        }
    }
    
    static void printArray(int arr[]){
        int n = arr.length;
    
        for(int i=0; i<n;i++){
          //System.out.print("|" + arr[i] + "| ");
            System.out.print(arr[i]+" ");	   
        }
        System.out.println();
    }
        
    public static void main(String[] args) {
        int arr[]= {2,21,55,7,16,2,4};
            
        System.out.println();
        System.out.println("Array");
        printArray(arr);
        System.out.println();    
        Insertion_Sort obj = new Insertion_Sort();
        obj.Sort(arr);
        
        System.out.println();
        //Insertion_Sort.Sort(arr); //if static added in sort fn
		System.out.println("Sorted array");
		
        printArray(arr);
        System.out.println();
    }

}

