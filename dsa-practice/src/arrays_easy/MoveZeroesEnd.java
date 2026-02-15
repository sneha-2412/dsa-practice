package arrays_easy;

public class MoveZeroesEnd {
	public void moveZeroes(int[] arr) {
        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining with zeroes
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
	 public static void main(String[] args)
	 {
	        MoveZeroesEnd sol = new MoveZeroesEnd();
	        int[] nums = {0, 1, 0, 3, 12};
	        sol.moveZeroes(nums);
	        // Print the result
	        for (int num : nums)
	            System.out.print(num + " ");
	    }
}
