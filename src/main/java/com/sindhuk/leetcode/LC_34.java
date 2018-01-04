package main.java.com.sindhuk.leetcode;

/**
 * Created by asraful on 10/3/2017.
 */
public class LC_34 {

    public int binarySearch(int arr[], int x, int flag) {

        int l = 0, r = arr.length - 1;
        int index = -1;
        while (l <= r) {
            int m = l + (r-l)/2;

            if (arr[m] == x) {
                index = m;
                if(flag == 0) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
                continue;
            }

            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        int result[] = {-1,-1};

        result[0] = binarySearch(nums,target,1);
        result[1] = binarySearch(nums,target,0);

        return result;
    }

    public static void main(String arg[]){
        LC_34 lc_34 = new LC_34();

        int a[] = {1,1,2,3,4,5,5,5,5,9};
        int ans[] = lc_34.searchRange(a,9);
        System.out.println(ans[0] + " " + ans[1]);
    }


}
