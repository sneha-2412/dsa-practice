package arrays_easy;

import java.util.ArrayList;
import java.util.List;

public class SortedUnion {

    public static List<Integer> findUnion(int[] arr1, int[] arr2) {

        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            int val;

            if (arr1[i] < arr2[j]) {
                val = arr1[i++];
            }
            else if (arr2[j] < arr1[i]) {
                val = arr2[j++];
            }
            else {
                val = arr1[i];
                i++;
                j++;
            }

            if (union.isEmpty() || union.get(union.size() - 1) != val) {
                union.add(val);
            }
        }

        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};

        List<Integer> result = findUnion(arr1, arr2);

        System.out.print("Union of two sorted arrays: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
