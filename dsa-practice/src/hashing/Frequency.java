package hashing;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public void optimal(int[] arr,int n)
	{
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
		//map.entrySet().forEach(System.out::println);
        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        //map.forEach((key, value) -> System.out.println(key + " " + value));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq) {
                maxFreq = count;
                maxEle = element;
            }

            if (count < minFreq) {
                minFreq = count;
                minEle = element;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

	}
	public static void main(String[] args) {
		int arr[]= {3,4,5,3,6,7,8,9,4};
		int n=arr.length;
		Frequency fc=new Frequency();
		fc.optimal(arr,n);
	}
}
