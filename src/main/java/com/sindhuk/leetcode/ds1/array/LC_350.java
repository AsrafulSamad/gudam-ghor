package main.java.com.sindhuk.leetcode.ds1.array;

import java.util.Hashtable;
import java.util.Stack;

public class LC_350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        Hashtable<Integer,Integer> counter = new Hashtable<>();
        Stack<Integer> ansStack = new Stack<>();

        for (int value: nums1) {
            if(counter.containsKey(value)){
                counter.put(value, counter.get(value) + 1);
            } else {
                counter.put(value, 1);
            }
        }

        int max = 0;
        for (int value: nums2) {
            if(counter.containsKey(value)){
                if(counter.get(value) > 0) {
                    counter.put(value, counter.get(value) - 1);
                    ansStack.add(value);
                    ++max;
                }
            }
        }

        int ans[] = new int[max];
        int i = 0;
        while (!ansStack.empty()){
            ans[i] = ansStack.pop();
            System.out.print(ans[i] + " ");
            ++i;
        }

        return ans;
    }

    public static void main(String arg[]) {
        int nums1[] = {1,2,2,1}, nums2[] = {2,2};
        LC_350  lc_350 = new LC_350();
        System.out.println();
        lc_350.intersect(nums1, nums2);
//        System.out.println(Arrays.stream(lc_350.intersect(nums1, nums2)).boxed());
    }
}
