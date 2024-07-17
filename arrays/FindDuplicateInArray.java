package arrays;
import java.util.HashSet;
public class FindDuplicateInArray{
    public static void main(String args[]){
        int arr[] = {1,3,4,2,2};
        System.out.println(bruteForce(arr));
        System.out.println(better(arr));
        System.out.println(optimised(arr));
    }
    private static int bruteForce(int arr[]){
        //for each element in array check, if its duplicate exists or not
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    private static int better(int arr[]){
        //Storing elements in a hashset
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(set.contains(arr[i])){
                return arr[i];
            }
            set.add(arr[i]);
        }
        return -1;
    }
    private static int optimised(int nums[]){
        //optimised approach T.C = O(N) S.C = O(1)
        /*
         * Same approach as finding start of a linkedlist cycle
         */
        int fast = 0;
        int slow = 0;
        do{
            fast = nums[nums[fast]];
            slow = nums[slow];
        }while(fast != slow);

        fast = 0;
        while(fast != slow){
            fast = nums[fast];
            slow = nums[slow];
        }
        return fast;
    }
}
