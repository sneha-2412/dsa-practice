package arrays_easy;

public class LargestElement {
	public int largest(int[] arr,int n)
	{
		int max=arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		LargestElement le=new LargestElement();
		int[] arr= {8,10,5,7,9};
		int n=arr.length;
		int largest = le.largest(arr,n);
		System.out.println(largest);
	}
}
