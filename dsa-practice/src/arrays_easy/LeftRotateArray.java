package arrays_easy;

class LeftRotateArray {

    public void rotateArrayByOne(int[] nums) {
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }

        nums[nums.length - 1] = temp;
    }

    public static void main(String[] args) {
        LeftRotateArray obj = new LeftRotateArray();
        int[] nums = {1, 2, 3, 4, 5};

        obj.rotateArrayByOne(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
