package main.java.com.sindhuk.leetcode.ds1.array;

import java.util.*;

public class LC_1 {
    public int[] twoSum(int[] nums, int target) {
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        int result[] = {-1,-1};

        for (int i =0; i <nums.length; i++) {
            if(hashtable.containsKey(target -nums[i])){
                result[0] = hashtable.get(target -nums[i]);
                result[1] = i;
                break;
            } else {
                hashtable.put(nums[i], i);
            }
        }
        return result;
    }

    public static void main(String arg[]) {
        int nums[] = {2,7,11,15};
        int sum = 9;
        LC_1 lc_1 = new LC_1();
        int ans[] = lc_1.twoSum(nums, sum);
        System.out.printf("%d, %d\n", ans[0], ans[1]);
    }
}
