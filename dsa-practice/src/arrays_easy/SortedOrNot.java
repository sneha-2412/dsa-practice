package arrays_easy;

public class SortedOrNot {
	public boolean isSorted(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If any element is smaller than the previous one, return false
                if (arr[j] < arr[i]) 
                    return false;
            }
        }
        return true; // Return true if no unsorted elements are found
    }
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5,0};
	        int n = arr.length;
	        SortedOrNot obj = new SortedOrNot();
	        
	        boolean ans = obj.isSorted(arr, n);
	        
	        // Output result
	        if (ans) 
	            System.out.println("True");
	        else 
	            System.out.println("False");
	    }
}
