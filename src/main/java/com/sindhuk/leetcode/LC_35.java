package main.java.com.sindhuk.leetcode;

/**
 * Created by asraful on 10/2/2017.
 */
public class LC_35 {

    int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was not present
        return l;
    }

    public int searchInsert(int[] nums, int target) {
        int ans = binarySearch(nums,target);
        return ans;
    }

    public static void main(String arg[]){
//        int nums[] = {1,3,5,6};
//        int target = 5; // → 2

//        int nums[] = {1,3,5,6};
//        int target = 2; // → 1

//        int nums[] = {1,3,5,6};
//        int target = 7; // → 4

//        int nums[] = {1,3,5,6};
//        int target = 0; // → 0

        int nums[] = {1,3,5,6,7};
        int target = 10;

        LC_35 lc_35 = new LC_35();

        System.out.println(lc_35.searchInsert(nums,target));


    }

}
