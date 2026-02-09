package sorting_techniques;

public class Insertion {

    public static void main(String[] args) {

        int nums[] = {5, 2, 4, 6, 1, 3};

        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        for(int i=1;i<nums.length;i++)
        {
        	int key=nums[i];
        	int j=i-1;
        	while(j>=0 && key<nums[j])
        	{
        		nums[j+1]=nums[j];
        		j=j-1;
        	}
        	nums[j+1]=key;
        }
        
        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
