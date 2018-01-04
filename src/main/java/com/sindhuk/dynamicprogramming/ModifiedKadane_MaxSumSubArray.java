package main.java.com.sindhuk.dynamicprogramming;

/**
 * Created by asraful on 7/23/2017.
 */
public class ModifiedKadane_MaxSumSubArray {

    // Time Complexity O(n) | Modified Kadane's Algo
    public static int maxSubArray(int[] nums) {
        int maxCur = nums[0], maxSoFar = nums[0];
        for(int i =1; i<nums.length; i++){
            maxCur = Math.max(nums[i], maxCur + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxCur);
        }
        return maxSoFar;
    }

    // Time Complexity O(n) | Modified Kadane's Algo
    public static int[] maxSubArrayTwo(int[] nums) {
        int ans[] = new int[3];  // 0 -> max, 1 -> start index(i), 2 -> end index(j);
        ans[0] = nums[0];
        ans[1] = 0;
        ans[2] = 0;

        int maxCur = nums[0];
        int temp_i = 0;
        int temp_j = 0;
        for(int i =1; i<nums.length; i++){
            if(nums[i] > (maxCur + nums[i])){
                maxCur = nums[i];
                temp_i = i;
            }else{
                maxCur = maxCur += nums[i];
            }
            temp_j = i;

            int temp = Math.max(ans[0], maxCur);
            if(ans[0] != temp){
                ans[0] = temp;
                ans[1] = temp_i;
                ans[2] = temp_j;
            }
        }
        return ans;
    }

    // Time Complexity O(n) | Find maximum sub array product
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxherepre = nums[0];
        int minherepre = nums[0];
        int maxsofar = nums[0];
        int maxhere, minhere;

        for (int i = 1; i < nums.length; i++) {
            maxhere = Math.max(Math.max(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
            minhere = Math.min(Math.min(maxherepre * nums[i], minherepre * nums[i]), nums[i]);
            maxsofar = Math.max(maxhere, maxsofar);
            maxherepre = maxhere;
            minherepre = minhere;
        }
        return maxsofar;
    }


    public static void main(String []arg){
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
        int ans[] = maxSubArrayTwo(a);
        System.out.println(ans[0] + " " + ans[1] + " " + ans[2]);
    }

}
