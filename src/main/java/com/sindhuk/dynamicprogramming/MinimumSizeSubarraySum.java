package main.java.com.sindhuk.dynamicprogramming;

/**
 * Created by asraful on 7/24/2017.
 */
public class MinimumSizeSubarraySum {
    public int minLenSubArraySum(int s,int[] nums) {
        int temp[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[i] = s;
        }
        int ans = -1;
        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(j+i-1<nums.length) {
                    temp[j] -= nums[j + i - 1];
                    if (temp[j] <= 0) {
                        ans = i;
                        break;
                    }
                }
            }
            if(ans != -1) {
                break;
            }
        }
        return ans == -1 ? 0 : ans;
    }
}
