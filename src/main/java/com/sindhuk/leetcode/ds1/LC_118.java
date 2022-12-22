package main.java.com.sindhuk.leetcode.ds1;

import java.util.ArrayList;
import java.util.List;

public class LC_118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int line = 1; line <= numRows; line++) {
            int C = 1;
            List<Integer> row = new ArrayList<>();
            for (int i = 1; i <= line; i++) {
                row.add(C);
                C = C * (line - i) / i;
            }
            ans.add(row);
        }
        return ans;
    }

    public static void main(String arg[]) {
        LC_118 LC_118 = new LC_118();
        List<List<Integer>> ans = LC_118.generate(5);
        System.out.println(ans);

    }
}
