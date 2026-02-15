package arrays_easy;

public class LongestSubArraySum {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxLength = 0;
        // starting index
        for (int startIndex = 0; startIndex < n; startIndex++) {
            // ending index
            for (int endIndex = startIndex; endIndex < n; endIndex++) {
                /* add all the elements of
                   subarray = nums[startIndex...endIndex] */
                int currentSum = 0;
                for (int i = startIndex; i <= endIndex; i++) {
                    currentSum += nums[i];
                }

                if (currentSum == k) {
                    maxLength = Math.max(maxLength, endIndex - startIndex + 1);
                }
            }
        }
        return maxLength;
    }
    public int longestSubarray1(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;

        int left = 0, right = 0;
        int sum = nums[0];

        while (right < n) {

            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) {
                sum += nums[right];
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = { -1,1,1 };
        int k = 1;
        LongestSubArraySum solution = new LongestSubArraySum();
        int len = solution.longestSubarray1(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
