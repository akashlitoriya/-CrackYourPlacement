package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProblem{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(10);
        arr.add(9);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        System.out.println(findMinDiff(arr, 6, 4));
    }
    public static long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int minDiff = Integer.MAX_VALUE;
        int i = 0;
        while(i + m - 1 < n){
            minDiff = Math.min(minDiff, a.get(i + m - 1) - a.get(i));
            i++;
        }
        return minDiff;
    }
}