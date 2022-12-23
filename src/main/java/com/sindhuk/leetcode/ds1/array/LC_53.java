package main.java.com.sindhuk.leetcode.ds1.array;

public class LC_53 {
    public int maxSubArray(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int maxSum = nums[0], prevSum = nums[0];

        for (int i= 1; i< nums.length; i++ ) {
            if(prevSum + nums[i] > nums[i]) {
                prevSum = prevSum + nums[i];
            } else {
                prevSum = nums[i];
            }

            if(prevSum > maxSum) {
                maxSum = prevSum;
            }
        }
        return maxSum;
    }

    public static void main(String arg[]) {
        int nums[] = {};
        LC_53 lc53 = new LC_53();
        System.out.println(lc53.maxSubArray(nums));
    }
}
