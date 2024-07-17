package arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,0,1,2,2,2,1,1,0,0};
        optimised(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void bruteForce(int arr[]){
        //Using sorting -> T.C = O(NlogN) S.C = O(1)
        Arrays.sort(arr);

    }

    private static void optimised(int arr[]){
        int n = arr.length;
        int low = 0;  //points to end of 1st half containing zeros
        int mid = 0;  //this is main pointer that will be used to traverse elements. Also points to end of 2nd half containing 1s
        int high = n-1; //this points to start of half containing two;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid] == 2){
                swap(arr, mid, high);
                high--;
            }else{
                mid++;
            }
        }
    }
    private static void swap(int arr[], int p, int q){
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
    }
}
