package Sorting;

public class BubbleSort {
	public static void bubbleSort(int[] arr,int n)
	{
		for(int i=0;i<n-1;i++)
		{
			boolean didSwap=false;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					didSwap=true;
				}
			}
			if(!didSwap)
				break;
		}
		System.out.println("After Bubble sort:");
	    for (int num : arr) 
	    	System.out.print(num + " ");
	}
	public static void main(String[] args) {
		int arr[]= {3,4,5,2,1,7,6};
		int n=arr.length;
		bubbleSort(arr,n);
	}
}
