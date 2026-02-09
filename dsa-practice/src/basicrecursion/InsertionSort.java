package basicrecursion;

public class InsertionSort {
	static void insertionSort(int[] arr,int i,int n)
	{
		if(i==n) return;
		int key=arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>key)
		{
			arr[j+1]=arr[j];
			j=j-1;
		}
		arr[j+1]=key;
		insertionSort(arr, i+1, n);
	}
	public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;

        System.out.println("Before Using Insertion Sort:");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();

        insertionSort(arr, 0, n);

        System.out.println("After Using Insertion Sort:");
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
}
