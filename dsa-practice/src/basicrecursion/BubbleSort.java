package basicrecursion;

public class BubbleSort {
	static void bruteforce(int[] arr, int n) 
	{
        if (n == 1) return;
        for (int j = 0; j <= n - 2; j++) {
            if (arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        bruteforce(arr, n - 1);
	}
	public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using Bubble Sort:");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        bruteforce(arr, n);
        System.out.println("After Using Bubble Sort:");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
