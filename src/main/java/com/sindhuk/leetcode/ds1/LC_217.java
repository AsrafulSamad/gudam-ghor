package main.java.com.sindhuk.leetcode.ds1;

import main.java.com.sindhuk.leetcode.LC_34;

import java.util.*;
import java.util.stream.IntStream;

public class LC_217 {
    public boolean containsDuplicate(int[] nums) {

        Integer[] boxedArray = Arrays.stream(nums)
                .boxed()
                .toArray(Integer[]::new);

        Set<Integer> s = new HashSet<>(Arrays.asList(boxedArray));

        return !(s.size() == boxedArray.length);
    }


    public static void main(String arg[]){
        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        LC_217 lc217 = new LC_217();
        System.out.println(lc217.containsDuplicate(nums));

    }
}
