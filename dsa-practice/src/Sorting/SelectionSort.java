package Sorting;

public class SelectionSort {
	public static void selectionSort(int[] arr,int n)
	{
		for(int i=0;i<n;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[minIndex])
					minIndex=j;
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
        System.out.println("After selection sort:");
        for (int num : arr) 
            System.out.print(num + " ");
	}
	public static void main(String[] args) {
		int arr[]= {3,4,5,2,1,7,6};
		int n=arr.length;
		selectionSort(arr,n);
	}
}
