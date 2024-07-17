package arrays;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,2,2,2,3,3,4,5};
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = i;
        int k = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                nums[k] = nums[i];
                i = j;
                k++;
            }

        }
        nums[k] = nums[i];
        return k + 1;

    }
}
