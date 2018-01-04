package main.java.com.sindhuk.leetcode;

/**
 * Created by asraful on 10/2/2017.
 */
public class LC_167 {

    public int binarySearch(int arr[], int x, int l, int r) {
        //int l = 0, r = arr.length - 1;
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
        return -1;
    }



    public int[] twoSum(int[] numbers, int target) {
        int ans[] = {-1,-1};
        int r = numbers.length - 1;
        for(int i=0;i<r;i++){
            int j = binarySearch(numbers,target - numbers[i],i+1,r);
            if(j!=-1){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
        }

        return ans;
    }


    public static void main(String arg[]){
        int a[] = {2, 7, 11, 15};
        int target = 9;

        LC_167 lc_167 = new LC_167();

        int ans[] = lc_167.twoSum(a,target);

        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }


}
