package main.java.com.sindhuk.leetcode;

/**
 * Created by asraful on 7/23/2017.
 */
public class LC_209 {

    // Time Complexity O(n^2)
    public static int minSubArrayLen(int[] nums, int s) {
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

    public static void main(String []arg){
        int a[] = {9};
        System.out.println(minSubArrayLen(a,7));
    }

}
