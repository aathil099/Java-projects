public class bubble_sort {

	public void sort(int[] array) {
		boolean isSorted;
		for (int i = 0; i<array.length; i++){
			isSorted = true;
			for(int j = 1; j<array.length; j++) {
				if(array[j] < array [j-1]) {
					swap(array,j,j-1);
					isSorted = false;
				}
				if (isSorted) {
					return;
				}
			}
		}
	}	
	private void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
	
	static void print(int sorted_array[]){
	    for (int i = 0; i < sorted_array.length; ++i)
	        System.out.print(sorted_array[i] + " ");
	        System.out.println();
	}
	public static void main(String args[]){
	    int arr[] = {21,16,7,4,2,55,10};
	    bubble_sort array = new bubble_sort();
   	    array.sort(arr);
	    print(arr);
	}
}


