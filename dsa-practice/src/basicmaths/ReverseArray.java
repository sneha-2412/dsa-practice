package basicmaths;

class Solution1 {
    public void reverseArray(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }
}

class ReverseArray{
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] arr = {1, 2, 3, 4, 5,8};
        sol.reverseArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
