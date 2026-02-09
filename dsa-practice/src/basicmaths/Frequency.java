package basicmaths;

public class Frequency {
	public void bruteforce(int[] arr,int n)
	{
		boolean visited[]=new boolean[n];
		int maxFreq=0,minFreq=n,maxEle=0,minEle=0;
		for(int i=0;i<n;i++)
		{
			if(visited[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					visited[j]=true;
				}
			}
			//System.out.println(arr[i]+" "+count);
			if(count>maxFreq)
			{
				maxEle=arr[i];
				maxFreq=count;
			}
			if(count<minFreq)
			{
				minEle=arr[i];
				minFreq=count;
			}
		}
		System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
	}
	public static void main(String[] args) {
		int arr[]= {3,4,5,3,6,7,8,9,4};
		int n=arr.length;
		Frequency fc=new Frequency();
		fc.bruteforce(arr,n);
	}
}

