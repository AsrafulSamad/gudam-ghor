package main.java.com.sindhuk.leetcode.ds1.array;

public class LC_121 {

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyAmt = prices[0];
        for(int i=1; i<prices.length; i++){
            int diff = prices[i] - buyAmt;
            if(diff > profit){
                profit = diff;
            }
            if(buyAmt > prices[i]) {
                buyAmt = prices[i];
            }
        }
        return profit;
    }


    public static void main(String arg[]) {
        int nums[] = {7,1,5,3,6,4};
        LC_121 lc_121 = new LC_121();
        int ans= lc_121.maxProfit(nums);
        System.out.println(ans);

    }
}
