package arrays;

import java.util.Arrays;

public class MoveZeros{
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,3,0,4,5};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;
        int i = 0;
        while(i < n){
            if(nums[i] != 0){
                nums[k] = nums[i];
                k++;
            }
            i++;
        }
        while(k < n){
            nums[k] = 0;
            k++;
        }

    }
}